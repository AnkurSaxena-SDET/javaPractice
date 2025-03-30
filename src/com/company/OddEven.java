package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        int n ;
        int m ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter a number");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("given Number is even number" );
        }
        else{
            System.out.println("given number is odd number");
        }

        System.out.println("please enter second number");
        m=sc.nextInt();
        int sum =n+m;
        System.out.println("Sum of two number: " +sum  );

    }

}
