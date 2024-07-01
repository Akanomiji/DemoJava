package com.mycompany.demojava;

public class StringTest {

    public static void main(String[] args) {
        stTest();
    }

    public static void stTest() {
        String st = "Chiangrai";
        System.out.println(st); //1
        System.out.println(st.length()); //2
        System.out.println(st.charAt(0)); //3
        System.out.println(st.charAt(st.length() - 1)); //4
        System.out.println("\n" + st.substring(0, 3) + "\n"); //5

        for (int i = 0; i <= st.length() - 1; i++) //6
        {
            System.out.println(st.charAt(i));
        }

        System.out.println();

        for (int i = 0; i <= st.length() - 1; i++) //6.2
        {
            System.out.print(st.substring(i, i + 1) + " ");
        }

        System.out.println("\n");

        for (int i = st.length() - 1; i >= 0; i--) //7.2
        {
            System.out.println(st.charAt(i));
        }

        System.out.println();

        for (int i = st.length() - 1; i >= 0; i--) //7
        {
            System.out.print(st.substring(i, i + 1) + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a') {
                System.out.println("Yes");
                break;
            }
        }
        System.out.println(st.indexOf("a", 4));

        int firstIndex = st.indexOf("C");

        if (st.indexOf("C", firstIndex + 1) >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //String st="Chiang Rai";
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
}
