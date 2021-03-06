/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv168.project.autocamp.gui;

import cz.muni.fi.pv168.project.autocamp.DBInteractionException;
import cz.muni.fi.pv168.project.autocamp.Parcel;
import cz.muni.fi.pv168.project.autocamp.ParcelManagerImpl;
import static cz.muni.fi.pv168.project.autocamp.gui.AutoCampMenu.logger;
import java.util.Collections;

import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Adam Gdovin, 433305
 * @author Lenka Smitalova, 410198
 *
 * @version May 3, 2016
 */
public class ParcelsTableModel extends AbstractTableModel {

    private final List<Parcel> parcels;
    private final DataSource dataSource;
    private final ParcelManagerImpl manager;
    private final JTable table;

    public ParcelsTableModel(JTable table) {
        dataSource = DBUtils.setDataSource();
        manager = new ParcelManagerImpl(dataSource);
        parcels = Collections.synchronizedList(manager.findAllParcels());
        this.table = table;
    }

    public ParcelManagerImpl getManager() {
        return manager;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public void setParcels(List<Parcel> parcels) {
        clearParcelTable();
        synchronized (parcels) {
            parcels.stream().forEach((parcel) -> {
                this.parcels.add(parcel);
            });
        }
    }

    @Override
    public int getRowCount() {
        return parcels.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return LocalizationWizard.getString("Location");
            case 2:
                return LocalizationWizard.getString("Electricity");
            case 3:
                return LocalizationWizard.getString("Water");
            default:
                throw new IllegalArgumentException("columnIndex");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Parcel parcel = parcels.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return parcel.getId();
            case 1:
                return parcel.getLocation();
            case 2:
                return parcel.isWithElectricity();
            case 3:
                return parcel.isWithWater();
            default:
                throw new IllegalArgumentException("columnIndex");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Parcel parcel = parcels.get(rowIndex);
        switch (columnIndex) {
            case 0:
                parcel.setId((Long) aValue);
                break;
            case 1:
                parcel.setLocation((String) aValue);
                break;
            case 2:
                parcel.setWithElectricity((boolean) aValue);
                break;
            case 3:
                parcel.setWithElectricity((boolean) aValue);
                break;
            default:
                throw new IllegalArgumentException("columnIndex");
        }
        updateParcel(parcel, rowIndex, columnIndex);

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Long.class;
            case 1:
                return String.class;
            case 2:
                return Boolean.class;
            case 3:
                return Boolean.class;
            default:
                throw new IllegalArgumentException("columnIndex");
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default:
                throw new IllegalArgumentException("columnIndex");
        }
    }

    public void updateParcel(Parcel parcel, int rowIndex, int columnIndex) {
        UpdateParcelWorker updateParcelWorker = new UpdateParcelWorker(parcel, rowIndex, columnIndex, ParcelsTableModel.this);
        updateParcelWorker.execute();
    }

    private class UpdateParcelWorker extends SwingWorker<Parcel, Void> {

        private final Parcel parcel;
        private int rowIndex;
        private int coulmnIndex;

        public UpdateParcelWorker(Parcel parcel, int rowIndex, int ColumnIndex, ParcelsTableModel tableModel) {
            this.parcel = parcel;
            this.rowIndex = rowIndex;
            this.coulmnIndex = coulmnIndex;
        }

        @Override
        protected Parcel doInBackground() throws Exception {
            Parcel oldParcel = manager.findParcelByID(parcel.getId());
            ParcelsTableModel.this.manager.updateParcel(parcel);
            AutoCampMenu.logger.info("UPDATE:" + oldParcel.toString() + " was succesfully updated to " + parcel.toString());
            return parcel;
        }

        protected void done() {
            try {
                get();
                fireTableCellUpdated(rowIndex, coulmnIndex);
            } catch (InterruptedException | ExecutionException ex) {
                JOptionPane.showMessageDialog(table, LocalizationWizard.getString("Update_parcel") + "\n"
                        + LocalizationWizard.getString("Log_file_info"));
                AutoCampMenu.logger.error(ex.getMessage());
            }
        }
    }

    public void createParcel(String location, Boolean withElectricity, Boolean withWater) {
        CreateParcelWorker createParcelWorker = new CreateParcelWorker(location, withElectricity, withWater);
        createParcelWorker.execute();
    }

    private class CreateParcelWorker extends SwingWorker<Parcel, Void> {

        private final Parcel parcel;

        public CreateParcelWorker(String location, Boolean withElectricity, Boolean withWater) {
            this.parcel = new Parcel(location, withElectricity, withWater);
        }

        @Override
        protected Parcel doInBackground() throws Exception {
            ParcelsTableModel.this.manager.createParcel(parcel);
            ParcelsTableModel.this.parcels.add(parcel);
            return parcel;
        }

        protected void done() {
            try {
                get();
                AutoCampMenu.logger.info("CREATE:" + parcel.toString() + " was succesfully created.");
                int row = ParcelsTableModel.this.parcels.size() - 1;
                ParcelsTableModel.this.fireTableRowsInserted(row, row);
            } catch (ExecutionException | InterruptedException ex) {
                JOptionPane.showMessageDialog(table, LocalizationWizard.getString("Create_parcel") + "\n"
                        + LocalizationWizard.getString("Log_file_info"));
                logger.error(ex.getMessage());
            }
        }
    }

    public void deleteParcel(int[] rows) {
        DeleteParcelWorker deleteParcelWorker = new DeleteParcelWorker(rows);
        deleteParcelWorker.execute();
    }

    public class DeleteParcelWorker extends SwingWorker<Boolean, Void> {

        private int[] rows;
        private boolean result = true;

        public DeleteParcelWorker(int[] rows) {
            this.rows = rows;
        }

        @Override
        protected Boolean doInBackground() throws Exception {
            for (int i = rows.length - 1; i >= 0; i--) {
                Parcel parcel = ParcelsTableModel.this.parcels.get(rows[i]);
                try {
                    ParcelsTableModel.this.manager.deleteParcel(parcel);
                    ParcelsTableModel.this.parcels.remove(parcel);
                    AutoCampMenu.logger.info("DELETE: " + parcel.toString() + " was succesfully deleted.");
                } catch (DBInteractionException e) {
                    AutoCampMenu.logger.error("Could not delete " + parcel.toString() + "; Exception: " + e.getMessage());
                    result = false;
                }
            }
            return result;
        }

        @Override
        protected void done() {
            try {
                if (!get()) {
                    JOptionPane.showMessageDialog(table, LocalizationWizard.getString("Delete_parcel") + "\n"
                            + LocalizationWizard.getString("Log_file_info"));
                }
                for (int i = rows.length - 1; i >= 0; i--) {
                    ParcelsTableModel.this.fireTableRowsDeleted(rows[i], rows[i]);
                }
            } catch (InterruptedException | ExecutionException ex) {
                JOptionPane.showMessageDialog(table, LocalizationWizard.getString("Delete") + "\n"
                        + LocalizationWizard.getString("Log_file_info"));
                logger.error(ex.getMessage());
            }
        }
    }

    public void filterParcels(String filter) {
        FilterParcelWorker filterParcelWorker = new FilterParcelWorker(filter);
        filterParcelWorker.execute();
    }

    public class FilterParcelWorker extends SwingWorker<List<Parcel>, Void> {

        private final String filter;

        public FilterParcelWorker(String filter) {
            this.filter = filter;
        }

        @Override
        protected List<Parcel> doInBackground() throws Exception {
            ParcelsTableModel.this.setParcels(ParcelsTableModel.this.manager.filterParcels(filter));
            return ParcelsTableModel.this.parcels;
        }

        @Override
        protected void done() {
            try {
                get();
                AutoCampMenu.logger.info("FILTER: Parcels were succesfully filtered, filter: " + filter + ".");
                ParcelsTableModel.this.fireTableDataChanged();
            } catch (InterruptedException | ExecutionException ex) {
                JOptionPane.showMessageDialog(table, LocalizationWizard.getString("Filter_error") + "\n"
                        + LocalizationWizard.getString("Log_file_info"));
                AutoCampMenu.logger.error(ex.getMessage());
            }
        }

    }

    public void clearParcelTable() {
        this.parcels.clear();
        this.fireTableDataChanged();
    }
}
