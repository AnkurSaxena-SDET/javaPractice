package com.company;

import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[]args){
        int n ;
        int sum=0;
        System.out.println("Please enter a number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1; i<=n; i=i+2)
        {
           sum=sum+i;
        }
        System.out.println("Sum of odd numbers: "  + sum);

    }

}
