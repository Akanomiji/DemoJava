
package com.mycompany.demojava;


public class ArrayTest {


    public static void main(String[] args) {
        System.out.println(getTextNumber(9));
        System.out.println(amountNumber(0));
    }
    
    public static String getTextNumber(int number) {
        String[] text = {"one","two","three","four","five","six","seven","eight","nine"};
        if(number >=1||number<=text.length-1){
            return text[number-1];
        }
        return"unknow";
        //else return"unknow";
    }
    
    public static int amountNumber(int x) {
        int[] number={1,2,3,5,2,2,1,1,3,4,2,3,1,5,4,1,2,3,2,1,5,4,1,2,3,2,1,2,2,2,2};
        int c=0;
        if (x>=0) {
            return number[x-1];
        }
        System.out.println();
        return c;
    }
    
}
