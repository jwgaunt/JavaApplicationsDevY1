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
    
    private double sizeOfTable;
    
    private String baseType;
    
    public Table(double sizeOfTable, String baseType){
        this.sizeOfTable = sizeOfTable;
        this.baseType = baseType;
    }
    
    public double calculatePrice(){
        
        return 0;
        
    }   

    @Override
    public String toString() {
        return super.toString()+ "Table{" + "sizeOfTable=" + sizeOfTable + ", baseType=" + baseType + '}';
    }
    
    
    
}
