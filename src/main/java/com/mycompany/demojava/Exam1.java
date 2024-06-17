/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.demojava;

/**
 *
 * @author com4936
 */
public class Exam1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        getTextNumber();
        
       
        
        
        
        
    }
    
    public static void getTextNumber() {
        
        /*
        int x =5;
        int y =8;
        int z = x+y;
        System.out.print(x+"+"+y+"="+z);
        //30
        //10+20=30
        */
        
        /*
        int x =5;
        int y =5;
        int z =x+y;
        if (z > 10) { System.out.print("More than 10"); }
        else { System.out.print("Less than 10 or equal 10"); }
        */
        
        /*
        int number=9;
        if (number ==1) { System.out.print("One"); }
        else if (number ==2) { System.out.print("Two"); }
        else if (number ==3) { System.out.print("Three"); }
        else if (number ==4) { System.out.print("Four"); }
        else if (number ==5) { System.out.print("Five"); }
        else if (number ==6) { System.out.print("Six"); }
        else if (number ==7) { System.out.print("Seven"); }
        else if (number ==8) { System.out.print("Eight"); }
        else if (number ==9) { System.out.print("Nine"); }
        else { System.out.print("Invalid"); }
        */
        
         }
    
    
    public static void getDayName() 
    {
        int day=1;
        
        if (day==1) {System.out.print("Monday");}
        else if (day==2) {System.out.print("Tuesday");}
        else if (day==3) {System.out.print("Wednesday");}
        else if (day==4) {System.out.print("Thursday");}
        else if (day==5) {System.out.print("Friday");}
        else if (day==6) {System.out.print("Saturday");}
        else if (day==7) {System.out.print("Sunday");}
        else {System.out.print("Invalid");}
    }
    
    public static void getMonthName () { 
        int month=1;
        
        if (month==1) {System.out.print("January");}
        else if (month==2) {System.out.print("February");}
        else if (month==3) {System.out.print("March");}
        else if (month==4) {System.out.print("April");}
        else if (month==5) {System.out.print("May");}
        else if (month==6) {System.out.print("June");}
        else if (month==7) {System.out.print("July");}
        else if (month==8) {System.out.print("August");}
        else if (month==9) {System.out.print("September");}
        else if (month==10) {System.out.print("October");}
        else if (month==11) {System.out.print("November");}
        else if (month==12) {System.out.print("December");}
        else { System.out.print("Invalid"); }
    }
    
    public static void getNumberOfMonth () { 
        int month=1;
        int years=2024;
        
        if (month==1) {System.out.print("January = 31 Days");}
        else if (month==2) {
            if (years %4 == 0) 
            { System.out.print("February = 29 Days"); }
            else { System.out.print("February = 29 Days"); }
        }
        else if (month==3) {System.out.print("March = 31 Days");}
        else if (month==4) {System.out.print("April = 30 Days");}
        else if (month==5) {System.out.print("May = 31 Days");}
        else if (month==6) {System.out.print("June = 30 Days");}
        else if (month==7) {System.out.print("July = 31 Days");}
        else if (month==8) {System.out.print("August = 31 Days");}
        else if (month==9) {System.out.print("September = 30 Days");}
        else if (month==10) {System.out.print("October = 31 Days");}
        else if (month==11) {System.out.print("November = 30 Days");}
        else if (month==12) {System.out.print("December = 31 Days");}
        
    }
    
}
