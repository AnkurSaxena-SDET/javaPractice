package com.company;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args){
        int n;
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter number of term");
        n=sc.nextInt();

        for(int i =1;i<=n;i++)
        {
            System.out.println(i + " ");
        }
        for (int j=1;j<=n; j++)
        {
            sum =sum+j;
        }
        System.out.println("sum of natural numbers: " + sum);
    }
}
