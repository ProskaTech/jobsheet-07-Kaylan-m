/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.prak7;

/**
 *
 * @author ASUS
 */
public class Tugas3NestedLoop {
    public static void main(String[] args){
        int baris,kolom;
        int maks=5;
        
        for(baris =1 ; baris <=maks ; baris++){
            for (kolom =1;kolom<=baris;kolom++){
                System.out.print(baris);
            }
            System.out.println("");
        }
    }
    
}
