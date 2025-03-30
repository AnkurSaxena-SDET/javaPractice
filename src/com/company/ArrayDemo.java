package com.company;


import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int size;
        int a[]=new int [5];
        int b[]=new int [5];
      Scanner sc =new Scanner(System.in);
      System.out.println("please enter value in first Array");
     for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("First Array Elements");

       for (int i=0;i<5;i++){
           System.out.print( a[i] + " ");
       }
        System.out.println("Second Array Element");
        for (int i=0; i<5;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]+ " ");
        }


    }
}
