
package com.mycompany.demojava;


public class ArrayTest {


    public static void main(String[] args) {
        //System.out.println(getTextNumber(9));
        /*
        System.out.println(amountNumber(1));
        System.out.println(amountNumber(2));
        System.out.println(amountNumber(3));
        System.out.println(amountNumber(4));
        System.out.println(amountNumber(5));
        */
        /*
        int[] n=amountNumber();
        for (int i=0; i <n.length; i++) {
            //i++;
            System.out.println(n[i]);
        }
        */
        int[] number={1,2,3,5,2,2,1,1,3,4,2,3,1,5,4,1,2,3,2,1,5,4,1,2,2,1,2,2,4,5};
        //int[] n = amountNumber(number);
        //showData(number);
        for (int i=1; i <=5; i++) {
            //i++;
            System.out.println(percentOfFrequency(number,i););
        }
        
        
    }
    
    public static String getTextNumber(int number) {
        String[] text = {"one","two","three","four","five","six","seven","eight","nine"};
        if(number >=1||number<=text.length-1){
            return text[number-1];
        }
        return"unknow";
        //else return"unknow";
    }
    
    public static int[] amountNumber(int[] number) {
        //int[] number={1,2,3,5,2,2,1,1,3,4,2,3,1,5,4,1,2,3,2,1,5,4,1,2,2,1,2,2,4,5};
        //1,2,3,5,2,2,1,1,3,4,2,3,1,5,4,1,2,3,2,1,5,4,1,2,3,2,1,2,2,2,2
        //int c1=0,c2=0,c3=0,c4=0,c5=0;
        int[] c={0,0,0,0,0};
        for(int i = 0;i <= number.length-1;i++)
        {
            c[number[i]-1]++;
            /*
            switch(number[i]) {
                case 1: c[number[i]-1]++; break;
                case 2: c[number[i]-1]++; break;
                case 3: c[number[i]-1]++; break;
                case 4: c[number[i]-1]++; break;
                case 5: c[number[i]-1]++; break;
            }
            */
        }
        //int[] c ={c1,c2,c3,c4,c5};
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
    
    public static void showData(int[] x) {
        for (int i=0; i <x.length; i++) {
            //i++;
            System.out.println(x[i]+" "+"Position : "+i);
        }
        //System.out.println(x+" ");
    }
    
    public static float percentOfFrequency(int[] x,i) {
        
        //float[] y={0,0,0,0,0};
        for (int i=0; i < x.length; i++){
            c[x[i]-1]++;
        }
        return c;
    }
    
    public static int[] getMax(int[] precent) {
        
        return null;
    }
    
    public static int[] getMin(int[] precent) {
        return null;
    }
    
}
