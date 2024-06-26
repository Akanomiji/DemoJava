
package com.mycompany.demojava;


public class StringTest {

 
    public static void main(String[] args) {
     stTest();
    }
    
    public static void stTest() {
        String st="Chiang Rai";
        //System.out.println(st.length());
        //System.out.println(st.charAt(0));
        //System.out.println(st.charAt(9));
        //System.out.println(st.substring(0,3));
        //System.out.println(st.substring(1,3));
        //System.out.println(st.substring(2,5));
        //System.out.println(st.substring(2));
        //System.out.println(st.substring(5,2));
        
        /*
        for(int i=0; i<=10;i++) {
            System.out.println(st.stsubstring(0,i));
        }
        */
        
        /*
        for(int i=9;i>=0;i--) {
            System.out.println(st.charAt(i));
        }
        */
        
        /*
        for(int i=10;i>=0;i--) {
            System.out.println(st.substring(i));
        }
        */
        /*
        for(int i=0; i<=10;i++) {
            if (st == "a"|| i<=10) {
                System.out.println("Have");
                break;
            }
            
        }
        */
        
        int firstIndex=st.indexOf("c");
        if (st.indexOf("c",firstIndex+1)>=0) {
                System.out.println("Have");
                
            }
        
       
    }
    
    
    
}
