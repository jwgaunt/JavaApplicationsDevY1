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

    //creating new ArrayList object
    private ArrayList<Furniture> Products = new ArrayList<>();

    //method to add a product to the ArrayList
    public void addProduct(Furniture furniture) {
        Products.add(furniture);

    }

    public int getPrice() {

        for (int i = 0; i < Products.size(); i++) {
            Furniture furniture = Products.get(i);
            System.out.println(furniture.calculatePrice());
        }
        return 0;

    }

    public String save() {

        return null;

    }

    public void load(String file) {

    }

    public void displaySummary() {
        System.out.println(Products.toString());
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < Products.size(); i++) {
            Furniture furniture = Products.get(i);
            totalPrice += furniture.calculatePrice();
        }

        return totalPrice;

    }

    public static void print(ArrayList<Furniture> Products) {
        for (Furniture furniture : Products) {
            System.out.println(furniture.calculatePrice());
        }
    }

    public void clearAll() {
        //empty the ArrayList
        Products.clear();
    }

 

    public void removeItem(int index) {
        //Removes an item from the specific index on the order grid
        Products.remove(index);
    }

 

    public boolean isSizeValid() {
        //returns false if the order is full
        int size = Products.size();
        if (size < 9) {
            return true;
        }
        System.out.println("Basket full!");
        return false;
    }
    
    public int getSize(){
        
        return Products.size();
        
    }

    @Override
    public String toString() {
        //returns the current order as a String

        return "Current Order: " + Products.toString() + '}';
    }

    public ArrayList<Furniture> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Furniture> Products) {
        this.Products = Products;
    }

}
