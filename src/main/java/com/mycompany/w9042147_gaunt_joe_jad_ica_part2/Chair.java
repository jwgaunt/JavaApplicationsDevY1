/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w9042147_gaunt_joe_jad_ica_part2;

/**
 *
 * @author jwgau
 */
public class Chair extends Furniture {
    
    private boolean armrests;
    

    public Chair(boolean armrests, int idNumber, double itemPrice, String typeOfWood) {
        super(idNumber, itemPrice, typeOfWood);
        this.armrests = armrests;
    }
    
    
    
    
    public double calculatePrice(){
        
        return 0;
        
    }

    @Override
    public String toString() {
        return super.toString() + "Chair{" + "armrests=" + armrests + '}';
    }
    
    
   
    
}
