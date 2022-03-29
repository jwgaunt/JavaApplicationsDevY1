/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w9042147_gaunt_joe_jad_ica_part2;

import java.io.Serializable;

/**
 *
 * @author jwgau
 */
public abstract class Furniture implements Serializable {
    
    protected int idNumber;
    protected double itemPrice;
    protected typeOfWood typeOfWood;
    protected int quantity;

    public Furniture(int idNumber, double itemPrice, typeOfWood typeOfWood, int quantity) {
        this.idNumber = idNumber;
        this.itemPrice = itemPrice;
        this.typeOfWood = typeOfWood;
        this.quantity = quantity;
       
    }
   
    public double calculatePrice(){
        
        return 0;
        
    }
    
    public int getIDNumber(){
        
        return 0;
        
    }

    @Override
    public String toString() {
        return "Furniture{" + "idNumber=" + idNumber + ", itemPrice=" + itemPrice + ", typeOfWood=" + typeOfWood + '}';
    }
    
    
    
    
    
    
    
}
