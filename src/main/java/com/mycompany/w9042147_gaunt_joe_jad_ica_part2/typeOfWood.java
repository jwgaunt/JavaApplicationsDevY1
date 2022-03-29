/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.w9042147_gaunt_joe_jad_ica_part2;

/**
 *
 * @author jwrgau
 */
public enum typeOfWood {
    Oak(4), Walnut(3);
    private final int priceOfWood;
    
    typeOfWood(int priceOfWood){
        this.priceOfWood = priceOfWood;
    }
    
    public int getPriceOfWood(){
        return priceOfWood;
    }
    
    
}

