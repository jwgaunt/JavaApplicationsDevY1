/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w9042147_gaunt_joe_jad_ica_part2;


/**
 *
 * @author jwgau
 */
public class driverClass {
    public static void main(String[] args) {
        Chair chair = new Chair(1, typeOfWood.Walnut, 3, true);
        Chair chair2 = new Chair(1, typeOfWood.Walnut, 3, true);
        Chair chair3 = new Chair(1, typeOfWood.Walnut, 3, true);
        
        
        Order order = new Order();
        order.displaySummary();
        order.addProduct(chair);
        order.displaySummary();
        System.out.println( order.getTotalPrice());
        order.addProduct(chair2);
        order.addProduct(chair3);
        order.displaySummary();
        System.out.println("and the total price is: ");
        System.out.println( order.getTotalPrice());
    }
}
