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

    public Chair(boolean armrests, int idNumber, double itemPrice,
            typeOfWood typeOfWood, int quantity) {
        super(idNumber, itemPrice, typeOfWood, quantity);
        this.armrests = armrests;
    }
    


    
    
    
    
    public int calculatePrice(boolean armrests, int quantity){
        if(armrests = true){
            return 1875 * quantity;
        }

        return 1625 * quantity;   
        }
        
        
    

    @Override
    public String toString() {
        return super.toString() + "Chair{" + "armrests=" + armrests + '}';
    }
}
    

   
    

