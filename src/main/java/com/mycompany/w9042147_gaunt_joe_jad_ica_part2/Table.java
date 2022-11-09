/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w9042147_gaunt_joe_jad_ica_part2;

/**
 *
 * @author jwgau
 */
public class Table extends Furniture {
    
    private String image = "table.jpg";
    private int diameter;
    
    private double sizeOfTable;
    
    private int priceOfWood;
    
    private int priceOfBase;
    
    private baseType baseType;

    public Table(int idNumber, typeOfWood typeOfWood, int quantity,
            int diameter, baseType baseType) {
        super(idNumber, typeOfWood, quantity);
        this.diameter = diameter;
        this.baseType = baseType;
    }
        
    @Override
    public int calculatePrice(){
        //calculating price of table object
        int itemPrice = 0;
        int amountOfWood = this.diameter * this.diameter;
        itemPrice = (amountOfWood * typeOfWood.getPriceOfWood()) + baseType.getPriceOfBase();
        itemPrice = itemPrice * quantity;
        return itemPrice;
        
    }   

    @Override
    public String toString() {
        return super.toString()+ "Table{" + "Diameter=" + diameter + ", baseType=" + baseType + '}';
    }
    
    @Override
    public String getImage() {
        return image; //To change body of generated methods, choose Tools | Templates.
    }    
    
    
    
}
