package com.company;
import java.util.*;
public class TakingInput {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the name");
        String name =sc.next();
        System.out.println("Please enter radius");
        int radius =sc.nextInt();
        double area = (radius*radius*3.14);
        System.out.println(area);
        System.out.println("please enter the number for table");
        int table=sc.nextInt();
        System.out.println("please find the table of number " +table);
        System.out.println(table);
        System.out.println(table*2);
        System.out.println(table*3);
        System.out.println(table*4);
        System.out.println(table*5);
        System.out.println(table*6);
        System.out.println(table*7);
        System.out.println(table*8);
        System.out.println(table*9);
        System.out.println(table*10);






    }
}
