package com.company;

import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[]args){
        int n;
        int sum=0;
        System.out.println("Please enter a range number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n;i=i+2)
        {

            System.out.println(i);
            sum =sum +i;
        }
        System.out.println("Sum of Even Number:" + sum);
    }
}
