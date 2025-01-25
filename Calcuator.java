package com.company;
import java.sql.SQLOutput;
import java.util.*;

public class Calcuator
{
    public static void main(String[] args) {
       Scanner  sc =new Scanner(System.in) ;
        System.out.println("Enter number a");
        int a =sc.nextInt();
        System.out.println("Enter number b");
        int b =sc.nextInt();
        int sum =a + b ;
        System.out.println("sum of a and b: " +sum);
        int sub =a - b;
        System.out.println("subtraction of a and b: " +sub);
        int multi =a * b;
        System.out.println("Multiplication of a and b: " +multi );
        int divide =a / b;
        System.out.println("Divide of a and b: " +divide);
        int mod = a % b ;
        System.out.println("Modulas of a and b: " +mod);

     System.out.println("Enter the number of month");
        int month =sc.nextInt();
        switch(month){
         case 1 : System.out.println("January");
         break;
         case 2 : System.out.println("February");
         break;
         case 3 : System.out.println("March");
         break;
         case 4 : System.out.println("April");
         break;
         case 5 : System.out.println("May");
         break;
         case 6 : System.out.println("June");
         break;
         case 7 : System.out.println("July");
         break;
         case 8 : System.out.println("August");
         break;
         case 9 : System.out.println("September");
         break;
         case 10 : System.out.println("October");
         break;
         case 11 : System.out.println("November");
         break;
         case 12 : System.out.println("December");
        }


    }
}
