
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
        int c=number[0];
        for(int i = 0;i <= number.length-1;i++)
        {
            if(number[i] < c)
                c = number[i];
        }
        return c;
    }
    
    public static String receiveNumber(int num1,int num2,int num3,int num4,int num5)
    {
        int[] number = {num1,num2,num3,num4,num5};
        String st = "";
        for(int i = 0;i <= number.length-1;i++)
        {
            st += number[i] + " ";
        }
        return st;
    }
    
}
