/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv168.project.autocamp.gui;

import cz.muni.fi.pv168.project.autocamp.Parcel;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

/**
 *
 * Adam Gdovin, 433305
 *
 * @version May 17, 2016
 */
public class ParcelRenderer extends JTextField implements TableCellRenderer {

    public ParcelRenderer() {
    }

    public Component getTableCellRendererComponent(
            JTable table, Object parcel,
            boolean isSelected, boolean hasFocus,
            int row, int column) {
        Parcel newParcel = (Parcel) parcel;
        setText(newParcel.getLocation());
        setToolTipText(String.valueOf(newParcel.getId()));
        return this;
    }
}
