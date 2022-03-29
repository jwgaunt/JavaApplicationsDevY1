/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w9042147_gaunt_joe_jad_ica_part2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jwgau
 */
public class Order implements Serializable {
    
    private ArrayList<Furniture> Products = new ArrayList<>();
    
    public void addProduct(Furniture furniture){
        Products.add(furniture);
        
    }
    
    public String save(){
        
        return null;
        
    }
    
    public void load(String file){
        
    }
    
    public void displaySummary(){
        System.out.println(Products.toString());
    }
    
    public double getTotalPrice(){
        
        return 0;
        
    }
    
    public void clearAll(){
        
    }
    
    public void updateItem(){
        
    }
    
    public void removeItem(){
        
    }
    
    public boolean validateID(int idNumber){
        
        return false;
        
    }
    
    public boolean validateFile(String fileName){
        
        return false;
        
    }
    
}
