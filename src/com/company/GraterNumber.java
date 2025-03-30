package com.company;
import java.util.Scanner;
public class GraterNumber {
    public static void main(String[] args){

        int a;
        int b;
        System.out.println("Please enter first number");
        Scanner sc=new Scanner (System.in);
        a=sc.nextInt();
        System.out.println("Please enter second number");
        b=sc.nextInt();
        if(a>b){
            System.out.println("First number is Grater then Second");
        }
        else{
            System.out.println("Second number is Grater then First");
        }

    }
}
