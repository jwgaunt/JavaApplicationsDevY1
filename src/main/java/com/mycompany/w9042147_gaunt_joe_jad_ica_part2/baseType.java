/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.w9042147_gaunt_joe_jad_ica_part2;

/**
 *
 * @author jwgau
 */
public enum baseType {
    
    Wooden(4500), Chrome(3500);
    private final int priceOfBase;
    
    baseType(int priceOfBase){
        this.priceOfBase = priceOfBase;
    }
    
    public int getPriceOfBase(){
        return priceOfBase;
    }
    
}
