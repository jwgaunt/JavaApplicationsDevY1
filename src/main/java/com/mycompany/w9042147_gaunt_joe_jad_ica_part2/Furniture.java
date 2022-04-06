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

    protected String image;
    protected int idNumber;
    //protected int itemPrice;
    protected typeOfWood typeOfWood;
    protected int quantity;

    public Furniture(int idNumber, typeOfWood typeOfWood, int quantity) {
        this.idNumber = idNumber;
        this.typeOfWood = typeOfWood;
        this.quantity = quantity;

    }

    public abstract int calculatePrice();

    public int getIDNumber() {

        return 0;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    
    
    

    @Override
    public String toString() {
        return "Furniture{" + "idNumber=" + idNumber + ", itemPrice=" + calculatePrice() + ", typeOfWood=" + typeOfWood + '}';
    }

}
