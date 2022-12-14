/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w9042147_gaunt_joe_jad_ica_part2;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author jwgau
 */
//CellRenderer to allow JList to accept images with good usability 
//instead of text

public class productsRenderer extends DefaultListCellRenderer
        implements ListCellRenderer <Object> {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        Furniture furniture = (Furniture)value;
        ImageIcon icon = new ImageIcon(furniture.getImage());
        setIcon(icon);
        return this;
    }
    
    
}
