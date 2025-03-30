package com.company;
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[]args){
        int n;
        int p;
        int result=1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter power value");
        p=sc.nextInt();
        for(int i =1; i<=p; i++){
            result=n*result;
        }
        System.out.println(result);



    }
}
