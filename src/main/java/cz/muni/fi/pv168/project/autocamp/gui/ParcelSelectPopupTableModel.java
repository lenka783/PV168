/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv168.project.autocamp.gui;

import cz.muni.fi.pv168.project.autocamp.AutoCampManagerImpl;
import cz.muni.fi.pv168.project.autocamp.Parcel;
import cz.muni.fi.pv168.project.autocamp.ParcelManagerImpl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import javax.swing.SwingWorker;
import javax.swing.table.AbstractTableModel;

/**
 *
 * Adam Gdovin, 433305
 *
 * @version May 16, 2016
 */
public class ParcelSelectPopupTableModel extends AbstractTableModel {

    private List<Parcel> parcels;
    private List<Parcel> emptyParcels;
    private DataSource dataSource;
    private ParcelManagerImpl manager;
    private AutoCampManagerImpl ACmanager;

    public ParcelSelectPopupTableModel(LocalDate from, LocalDate to) {
        dataSource = DBUtils.setDataSource();
        manager = new ParcelManagerImpl(dataSource);
        ACmanager = new AutoCampManagerImpl(dataSource);
        parcels = ACmanager.findEmptyParcelsForGivenDate(from, to);
        emptyParcels = new ArrayList<>(parcels);
    }

    public ParcelManagerImpl getManager() {
        return manager;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public void setParcels(List<Parcel> parcels) {
        clearParcelTable();
        for (Parcel parcel : parcels) {
            if (this.emptyParcels.contains(parcel)) {
                this.parcels.add(parcel);
            }
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

    public Parcel selectParcel(int row) {
        return this.parcels.get(row);
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
            ParcelSelectPopupTableModel.this.setParcels(ParcelSelectPopupTableModel.this.manager.filterParcels(filter));
            return ParcelSelectPopupTableModel.this.parcels;
        }

        @Override
        protected void done() {
            ParcelSelectPopupTableModel.this.fireTableDataChanged();
        }

    }

    public void clearParcelTable() {
        this.parcels.clear();
        this.fireTableDataChanged();
    }
}
