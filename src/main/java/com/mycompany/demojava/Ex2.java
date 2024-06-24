
package com.mycompany.demojava;


public class Ex2 {

    
    public static void main(String[] args) {
        //int ans = plusNumber(489,658);
        //System.out.println(ans);
        //int result = computeNumber(8,4,'+');
        //System.out.println(result);
        //showMulti(3);
        //showAtoZ();
        //showAtoN(0);
        //evenAtoN();
        oddAtoN(5);
    }
    
    public static int plusNumber(int num1,int num2) {
        int answer = num1 + num2;
        System.out.println(answer);
        return answer;
    }
    
    public static int computeNumber(int num1,int num2,char opt) {
        int answer =0;
        switch(opt) {
            case '+': return num1+num2;
            case '-': return num1-num2;
            case '*': return num1*num2;
            case '/': return num1/num2;
        } 
        return 0;
    }
    
    public static String getProgramName() {
        int programcode =+ 63;
        if(programcode ==13) {
            return "Infirmater Technology";  
        }
        else {return "Computer";}
    }
    
    
    public static void show1ToN(int n) {
        for(int i=1;i<=n;i++) {
            System.out.println(i);
        }
    }
    
    public static void showAtoZ(){
        for(int i=65; i<=90;i++){
            char w = (char)i;
            System.out.println(w);
        }
    }
    
    public static void showMulti(int n) {
        for(int i=1; i<=12;i++){
            int sum = i*n;
            System.out.println(sum);
        }
    }
    
    public static void showAtoN(int sum){
        for(int i=65;i<=78;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
    
    
    public static void evenAtoN() {
        for(int i=65;i<=78;i++) {
            
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
    public static void oddAtoN(int n) {
        for(int i=65;i<=78;i++) {
            
            if(i % n == 0) {
                System.out.println(i);
            }
        }
    }
    
}
