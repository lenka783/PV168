/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv168.project.autocamp.gui;
/**
 *
 * @author Administrator
 */
public class AutoCampMenu extends javax.swing.JFrame {

    /**
     * Creates new form AutoCampMenu
     */
    public AutoCampMenu() {
        initComponents();
        GuestsTableModel guestsModel = (GuestsTableModel) guestTable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        reservationsButton = new javax.swing.JButton();
        guestsButton = new javax.swing.JButton();
        parcelsButton = new javax.swing.JButton();
        autocampTabbedPane = new javax.swing.JTabbedPane();
        guestsTab = new javax.swing.JPanel();
        guestTablePanel = new javax.swing.JScrollPane();
        guestTable = new javax.swing.JTable();
        guestCreateButton = new javax.swing.JButton();
        guestPhoneField = new javax.swing.JTextField();
        guestFullNameField = new javax.swing.JTextField();
        guestFullNameLabel = new javax.swing.JLabel();
        guestPhoneLabel = new javax.swing.JLabel();
        guestFilterField = new javax.swing.JTextField();
        guestFilterButton = new javax.swing.JButton();
        parcelsTab = new javax.swing.JPanel();
        parcelScrollPane = new javax.swing.JScrollPane();
        parcelTable = new javax.swing.JTable();
        parcelCreateButton = new javax.swing.JButton();
        parcelLocationField = new javax.swing.JTextField();
        parcelLocationLabel = new javax.swing.JLabel();
        parcelFilterField = new javax.swing.JTextField();
        parcelFilterButton = new javax.swing.JButton();
        parcelElectricityCheckBox = new javax.swing.JCheckBox();
        parcelWaterCheckBox = new javax.swing.JCheckBox();
        parcelResourcesLabel = new javax.swing.JLabel();
        Reservations = new javax.swing.JPanel();
        reservationsScrollPane = new javax.swing.JScrollPane();
        reservationsTable = new javax.swing.JTable();
        reservationsCreateButton = new javax.swing.JButton();
        reservationsFromField = new javax.swing.JTextField();
        reservationsFromLabel = new javax.swing.JLabel();
        reservationsFilterField = new javax.swing.JTextField();
        reservationsFilterButton = new javax.swing.JButton();
        reservationsToLabel = new javax.swing.JLabel();
        reservationsToField = new javax.swing.JTextField();
        reservationsParcelField = new javax.swing.JTextField();
        reservationsParcelLabel = new javax.swing.JLabel();
        reservationsGuestField = new javax.swing.JTextField();
        reservationsGuestLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(204, 204, 204));
        leftPanel.setFocusable(false);

        reservationsButton.setBackground(new java.awt.Color(255, 255, 255));
        reservationsButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        reservationsButton.setText("Reservations");
        reservationsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationsButtonMouseClicked(evt);
            }
        });

        guestsButton.setBackground(new java.awt.Color(255, 255, 255));
        guestsButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        guestsButton.setText("Guests");
        guestsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestsButtonMouseClicked(evt);
            }
        });

        parcelsButton.setBackground(new java.awt.Color(255, 255, 255));
        parcelsButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        parcelsButton.setText("Parcels");
        parcelsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parcelsButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guestsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(parcelsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parcelsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        autocampTabbedPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        autocampTabbedPane.setToolTipText("");

        guestTable.setModel(new GuestsTableModel() );
        guestTablePanel.setViewportView(guestTable);

        guestCreateButton.setText("Create");

        guestFullNameLabel.setText("Full name:");

        guestPhoneLabel.setText("Phone:");

        guestFilterButton.setText("Filter");

        javax.swing.GroupLayout guestsTabLayout = new javax.swing.GroupLayout(guestsTab);
        guestsTab.setLayout(guestsTabLayout);
        guestsTabLayout.setHorizontalGroup(
            guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guestTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addGroup(guestsTabLayout.createSequentialGroup()
                .addGroup(guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guestsTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(guestPhoneLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guestFullNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guestPhoneField)
                            .addComponent(guestFullNameField)))
                    .addComponent(guestFilterField))
                .addGap(18, 18, 18)
                .addGroup(guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guestCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guestFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        guestsTabLayout.setVerticalGroup(
            guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guestsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(guestsTabLayout.createSequentialGroup()
                        .addGroup(guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guestFullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guestFullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guestPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guestPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(guestCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guestsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guestFilterField)
                    .addComponent(guestFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guestTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );

        autocampTabbedPane.addTab("Guests", guestsTab);

        parcelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Location", "Electiricty", "Water", "Delete"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        parcelScrollPane.setViewportView(parcelTable);

        parcelCreateButton.setText("Create");
        parcelCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcelCreateButtonActionPerformed(evt);
            }
        });

        parcelLocationLabel.setText("Location:");

        parcelFilterButton.setText("Filter");

        parcelElectricityCheckBox.setText("Electricity");

        parcelWaterCheckBox.setText("Water");

        parcelResourcesLabel.setText("Resources:");

        javax.swing.GroupLayout parcelsTabLayout = new javax.swing.GroupLayout(parcelsTab);
        parcelsTab.setLayout(parcelsTabLayout);
        parcelsTabLayout.setHorizontalGroup(
            parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parcelScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addGroup(parcelsTabLayout.createSequentialGroup()
                .addGroup(parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parcelFilterField)
                    .addGroup(parcelsTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parcelLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parcelResourcesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parcelsTabLayout.createSequentialGroup()
                                .addComponent(parcelElectricityCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(parcelWaterCheckBox)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(parcelLocationField))))
                .addGap(18, 18, 18)
                .addGroup(parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parcelCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parcelFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        parcelsTabLayout.setVerticalGroup(
            parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parcelsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(parcelsTabLayout.createSequentialGroup()
                        .addGroup(parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parcelLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parcelLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parcelElectricityCheckBox)
                            .addComponent(parcelWaterCheckBox)
                            .addComponent(parcelResourcesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(parcelCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(parcelsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(parcelFilterField)
                    .addComponent(parcelFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parcelScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );

        autocampTabbedPane.addTab("Parcels", parcelsTab);

        reservationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "From", "To", "Guest", "Parcel", "Delete"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservationsScrollPane.setViewportView(reservationsTable);

        reservationsCreateButton.setText("Create");

        reservationsFromLabel.setText("From:");

        reservationsFilterButton.setText("Filter");

        reservationsToLabel.setText("To:");

        reservationsParcelLabel.setText("Parcel:");

        reservationsGuestLabel.setText("Guest:");

        javax.swing.GroupLayout ReservationsLayout = new javax.swing.GroupLayout(Reservations);
        Reservations.setLayout(ReservationsLayout);
        ReservationsLayout.setHorizontalGroup(
            ReservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reservationsScrollPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationsLayout.createSequentialGroup()
                .addGroup(ReservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservationsLayout.createSequentialGroup()
                        .addGroup(ReservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reservationsFilterField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReservationsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(reservationsFromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reservationsFromField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reservationsToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reservationsToField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 134, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(ReservationsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(reservationsGuestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reservationsGuestField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reservationsParcelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reservationsParcelField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(ReservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservationsCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservationsFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ReservationsLayout.setVerticalGroup(
            ReservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReservationsLayout.createSequentialGroup()
                        .addGroup(ReservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reservationsFromField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservationsFromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservationsToField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservationsToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reservationsGuestField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservationsGuestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservationsParcelField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservationsParcelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(reservationsCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReservationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reservationsFilterField)
                    .addComponent(reservationsFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reservationsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );

        autocampTabbedPane.addTab("Reservations", Reservations);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(autocampTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(autocampTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parcelCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcelCreateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parcelCreateButtonActionPerformed

    private void guestsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestsButtonMouseClicked
        autocampTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_guestsButtonMouseClicked

    private void parcelsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parcelsButtonMouseClicked
        autocampTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_parcelsButtonMouseClicked

    private void reservationsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationsButtonMouseClicked
        autocampTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_reservationsButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutoCampMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoCampMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoCampMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoCampMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoCampMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Reservations;
    private javax.swing.JTabbedPane autocampTabbedPane;
    private javax.swing.JButton guestCreateButton;
    private javax.swing.JButton guestFilterButton;
    private javax.swing.JTextField guestFilterField;
    private javax.swing.JTextField guestFullNameField;
    private javax.swing.JLabel guestFullNameLabel;
    private javax.swing.JTextField guestPhoneField;
    private javax.swing.JLabel guestPhoneLabel;
    private javax.swing.JTable guestTable;
    private javax.swing.JScrollPane guestTablePanel;
    private javax.swing.JButton guestsButton;
    private javax.swing.JPanel guestsTab;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton parcelCreateButton;
    private javax.swing.JCheckBox parcelElectricityCheckBox;
    private javax.swing.JButton parcelFilterButton;
    private javax.swing.JTextField parcelFilterField;
    private javax.swing.JTextField parcelLocationField;
    private javax.swing.JLabel parcelLocationLabel;
    private javax.swing.JLabel parcelResourcesLabel;
    private javax.swing.JScrollPane parcelScrollPane;
    private javax.swing.JTable parcelTable;
    private javax.swing.JCheckBox parcelWaterCheckBox;
    private javax.swing.JButton parcelsButton;
    private javax.swing.JPanel parcelsTab;
    private javax.swing.JButton reservationsButton;
    private javax.swing.JButton reservationsCreateButton;
    private javax.swing.JButton reservationsFilterButton;
    private javax.swing.JTextField reservationsFilterField;
    private javax.swing.JTextField reservationsFromField;
    private javax.swing.JLabel reservationsFromLabel;
    private javax.swing.JTextField reservationsGuestField;
    private javax.swing.JLabel reservationsGuestLabel;
    private javax.swing.JTextField reservationsParcelField;
    private javax.swing.JLabel reservationsParcelLabel;
    private javax.swing.JScrollPane reservationsScrollPane;
    private javax.swing.JTable reservationsTable;
    private javax.swing.JTextField reservationsToField;
    private javax.swing.JLabel reservationsToLabel;
    // End of variables declaration//GEN-END:variables
}
