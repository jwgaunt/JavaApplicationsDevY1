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
    
    private int priceOfWood;
    
    private int priceOfBase;
    
    private baseType baseType;
    

    public Table (int idNumber, 
            double itemPrice, 
            typeOfWood typeOfWood, 
            int quantity, 
            double sizeOfTable, 
            baseType baseType ){
        super(idNumber, itemPrice, typeOfWood, quantity);
        this.sizeOfTable = sizeOfTable;
        this.baseType = baseType;
    }
    
    @Override
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
