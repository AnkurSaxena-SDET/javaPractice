package com.company;

import java.util.Scanner;

public class CWE_13_string {
    public static void main(String[] args) {
        //String name = "Ankur";
        //System.out.println(name);
        // different type of print in format
        //int a =6;
        //float b=  5.6454f;
        //System.out.printf("The value of a is %d and The value of b id %f", a, b);
        //ankur is good boy
        // System.out.format("The value of a is %d and the value of b is %f", a,b);
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        String str1 =sc.nextLine();
        System.out.println(str);
        System.out.println(str1);

    }
}
