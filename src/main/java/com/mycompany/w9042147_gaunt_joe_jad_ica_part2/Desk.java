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

    public Desk(int idNumber, int itemPrice, typeOfWood typeOfWood,
            int quantity, int numberOfDraws, int width, int depth) {
        super(idNumber, itemPrice, typeOfWood, quantity);
        this.numberOfDraws = numberOfDraws;
        this.width = width;
        this.depth = depth;
    }


    

    
    public int calculatePrice(int numberOfDraws){
        itemPrice = ((80 + width + depth) + (depth * width)
                * typeOfWood.getPriceOfWood() + (numberOfDraws * 850));
                
        return itemPrice;
        
    }

    @Override
    public String toString() {
        return super.toString() + "Desk{" + "numberOfDraws=" + numberOfDraws + ", width=" + width + ", depth=" + depth + '}';
    }
    
    
    
}
 