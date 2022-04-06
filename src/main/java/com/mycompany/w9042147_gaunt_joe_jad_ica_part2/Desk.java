/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w9042147_gaunt_joe_jad_ica_part2;

/**
 *
 * @author jwgau
 */
public class Desk extends Furniture {

    private int numberOfDraws;
    private int width;
    private int depth;
    private String image = "desk.jpg";

    public Desk(int idNumber, typeOfWood typeOfWood, int quantity,
            int numberOfDraws, int width, int depth
    ) {
        super(idNumber, typeOfWood, quantity);
        this.numberOfDraws = numberOfDraws;
        this.width = width;
        this.depth = depth;
        
        
    }

    @Override
    public String toString() {
        return super.toString() + "Desk{" + "numberOfDraws=" + numberOfDraws + ", width=" + width + ", depth=" + depth + '}';
    }

    @Override
    public int calculatePrice() {
        int itemPrice = 0;
        
        itemPrice = ((80 + width + depth) + (depth * width)
                * typeOfWood.getPriceOfWood() + (numberOfDraws * 850));
        
        itemPrice = itemPrice * quantity;

        return itemPrice;
    }

    @Override
    public String getImage() {
        return image; //To change body of generated methods, choose Tools | Templates.
    }


    
    

}
