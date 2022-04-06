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
    private String image = "chair.jpg";

    public Chair(int idNumber,
            typeOfWood typeOfWood, int quantity, boolean armrests) {
        super(idNumber, typeOfWood, quantity);
        this.armrests = armrests;
    }

    @Override
    public String toString() {
        return super.toString() + "Chair{" + "armrests=" + armrests + '}';
    }

    @Override
    public int calculatePrice() {
        
        int itemPrice = 0;
        if (armrests == true) {

            itemPrice = 1875 * quantity;
        }
        else {
            itemPrice = 1625 * quantity;
        }

        return itemPrice;
    }
    
    @Override
    public String getImage() {
        return image; //To change body of generated methods, choose Tools | Templates.
    }    
}
