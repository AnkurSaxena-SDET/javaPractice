package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class Condition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the age");
        int age =sc.nextInt();
         if (age >=18){
             System.out.println("person are a voter");

         }
         else {
             System.out.println("personal is not a voter");
         }
        System.out.println("please enter number to find even or odd");
        int mod =sc.nextInt();

         if(mod % 2==0){
             System.out.println("given number is even number");
         }
         else
         {
             System.out.println("given number is odd number");
         }

        System.out.println("Plesae enter a");
         int a =sc.nextInt();
        System.out.println("Please enter b");
        int b =sc.nextInt();

        if (a==b){
            System.out.println("number a is equal to number b");
        }
        else if(a > b) {
            System.out.println("number a is greater the number b");
        }
        else {
            System.out.println("number a is smaller the number b");
        }
        System.out.println("Please Enter the button");
        int button=sc.nextInt();

        if(button ==1){
            System.out.println("Hello");
        }else if(button ==2){
            System.out.println("Namaste");
        }else if(button ==3){
            System.out.println("Bonjour");
        } else {
            System.out.println("invalid Button");
        }
        System.out.println("please enter meow button");
        int meow =sc.nextInt();
        switch(meow){
        case 1 : System.out.println("meow");
        break;
        case 2 : System.out.println("meow meow");
        break;
        case 3 : System.out.println("meow meow meow");
        break;
        case 4 : System.out.println("invalid input");
        }
    }
}

