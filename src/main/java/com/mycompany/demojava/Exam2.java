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
    public static void main(String[] args) 
    {
        int x=5;
        int y=8;
        int z=x+y;
        //30
        //10+20=30
       System.out.print(x+" + "+y+" = "+z);
         if(z>10)
         {
             System.out.print("more than 10");
         }
         else if(z<10)
             System.out.print("less than or equal");           
    }
    public static void getTextNumber()
    {   
     int number = 0;
           if(number == 0)
           {
               System.out.print("Zero");
           }
           else if(number == 1)
           {
               System.out.print("one");
           }
           else if(number == 2)
           {
               System.out.print("two");
           }else if(number == 3)
           {
               System.out.print("three");
           }else if(number == 4)
           {
               System.out.print("four");
           }else if(number == 5)
           {
               System.out.print("five");
           }else if(number == 6)
           {
               System.out.print("six");
           }else if(number == 7)
           {
               System.out.print("seven");
           }else if(number == 8)
           {
               System.out.print("eight");
           }else if(number == 9)
           {
               System.out.print("nine");
           }  
        }
   public static void getDayName(){
     int DayName = 1; 
      if(DayName == 1)
      {
       System.out.print("month");
      }
       else if(DayName == 2)
      {
       System.out.print("Tuesday");
      }
       else if(DayName == 3)
      {
       System.out.print("Wednesday");
      }
       else if(DayName == 4)
      {
       System.out.print("Thursday ");
      }
       else if(DayName == 5)
      {
       System.out.print("Friday");
      }
    }
  public static void getMonthName()
   {
      int monthname =1;
        if(monthname == 1)
        {
         System.out.print("January");
        }
        else if(monthname == 2)
        {
         System.out.print("Fedruary");
        }else if(monthname == 3)
        {
         System.out.print("March");
        }else if(monthname == 4)
        {
         System.out.print("Aprii");
        }else if(monthname == 5)
        {
         System.out.print("May");
        }else if(monthname == 6)
        {
         System.out.print("June");
        }else if(monthname == 7)
        {
         System.out.print("July");
        }else if(monthname == 8)
        {
         System.out.print("August");
        }else if(monthname == 9)
        {
         System.out.print("September");
        }else if(monthname == 10)
        {
         System.out.print("October");
        }else if(monthname == 11)
        {
         System.out.print("November");
        }else if(monthname == 12)
        {
         System.out.print("December");
        }
    }
     public static void getYearOfMonth()
    {
      int month=1;
      int year=2024;
          if(month == 1)
          {
            System.out.print("january 31day");
          }
          else if(month == 2)
        {
          if(year % 4 == 0)
          {
          System.out.print("Fedruary 28day");
          }
          else
          {
          System.out.print("Fedruary 29day");
          }
        }
        else if(month == 3)
        {
         System.out.print("March 31day");
        }
        else if(month == 4)
        {
         System.out.print("Aprii 30day");
        }else if(month == 5)
        {
         System.out.print("May 31day");
        }else if(month == 6)
        {
         System.out.print("June 30day");
        }else if(month == 7)
        {
         System.out.print("July 31day");
        }
         else if(month == 8)
        {
         System.out.print("August 31day");
        }
         else if(month == 9)
        {
         System.out.print("September 30day");
        }
         else if(month == 10)
        {
         System.out.print("October 31day");
        }
         else if(month == 11)
        {
         System.out.print("November 30day");
        }
         else if(month == 12)
        {
         System.out.print("December 31day");
        }
    }
    
}
