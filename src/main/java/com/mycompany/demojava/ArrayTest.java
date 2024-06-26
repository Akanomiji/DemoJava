
package com.mycompany.demojava;


public class ArrayTest {


    public static void main(String[] args) {
        System.out.println(getTextNumber(10));
        
    }
    
    public static String getTextNumber(int number) {
        String[] text = {"one","two","three","four","five","six","seven","eight","nine"};
        if(number >=1||number<=text.length-1){
            return text[number-1];
        }
        //return"unknow";
        else return"unknow";
    }
    
}
