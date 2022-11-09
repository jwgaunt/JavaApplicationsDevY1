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
        Chair chair2 = new Chair(1, typeOfWood.Walnut, 3, false);
        Table table = new Table(2,typeOfWood.Oak,5,6, baseType.Chrome);
        Table table2 = new Table(2,typeOfWood.Oak,5,6, baseType.Wooden);
        Desk desk = new Desk(2,typeOfWood.Oak,7,45,8,4);
        Desk desk2 = new Desk(2,typeOfWood.Oak,7,45,87,44);
        
        System.out.println("Driver class testing: ");
        
        System.out.println("Chair 1...");
        System.out.println(chair.toString());
        System.out.println(chair.calculatePrice());
        
        System.out.println("Chair 2...");
        System.out.println(chair2.toString());
        System.out.println(chair2.calculatePrice());
        
        System.out.println("Table 1...");
        System.out.println(table.toString());
        System.out.println(table.calculatePrice());
        
        System.out.println("Table 2...");
        System.out.println(table2.toString());
        System.out.println(table2.calculatePrice());
        
        System.out.println("Desk 1...");
        System.out.println(desk.toString());
        System.out.println(desk.calculatePrice());
        
        System.out.println("Desk 2...");
        System.out.println(desk2.toString());
        System.out.println(desk2.calculatePrice());
        
        
        
        
        
    }
}
