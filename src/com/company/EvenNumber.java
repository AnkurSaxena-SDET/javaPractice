package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number");
        int num =sc.nextInt();
        if(num % 2==0){
            System.out.println("given number is even number");
        }
        else {
            System.out.println("given number is odd number");
        }
        System.out.println("Print all even numbers till: "+num);
        for(int i=0; i<=num; i++) {
          if(i % 2 ==0)
            System.out.println( i);
        }



    }
}
