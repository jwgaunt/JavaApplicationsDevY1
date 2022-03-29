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
    
    private int diameter;
    
    private double sizeOfTable;
    
    private String typeOfWood;
    
    private String baseType;
    

    public Table(double sizeOfTable, String baseType, int idNumber, double itemPrice, String typeOfWood) {
        super(idNumber, itemPrice, typeOfWood);
        this.sizeOfTable = sizeOfTable;
        this.baseType = baseType;
        this.diameter = diameter;
    }
    

    
    public double calculatePrice(){
        
        int amountOfWood = this.diameter * this.diameter;
        itemPrice = (amountOfWood * typeOfWood.getPriceOfWood()) + baseType.getPriceOfBase();
        this.itemPrice = itemPrice * quantity;
        return itemPrice;
        
    }   

    @Override
    public String toString() {
        return super.toString()+ "Table{" + "sizeOfTable=" + sizeOfTable + ", baseType=" + baseType + '}';
    }
    
    
    
}
