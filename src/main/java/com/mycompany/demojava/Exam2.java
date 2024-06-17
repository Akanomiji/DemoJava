/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.demojava;

/**
 *
 * @author com4936
 */
public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        showEvenNumber();
    }
    
    public static void showNumber() {
        int i = 1;
        while(i<=10) { 
            System.out.println(i);
            i++;
        }
    }
    
    public static void showNumber2() { 
        int i=1;
        do {
            System.out.println(i+" ");
            if (i % 10 == 0)
            i++;
            
        } while (i<=100);
    }
    
    public static void showEvenNumber(){ 
        for(int i=2; i<=100; i=i+2) { 
            System.out.println(i);
        }
     }
    
    public static void showOddNumber(){
        int i=1;
        while(i<=100) {
            System.out.println(i);
            i=i+2;
        }
    }
    
    
    public static void showAtoZ() {}
    
    
}
