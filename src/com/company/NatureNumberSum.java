package com.company;
import java.util.*;
public class NatureNumberSum {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.println("please into the number");
        int n =sc.nextInt();
        int sum =0;
        for(int i=1; i<=n; i++){
            sum = (sum + i);
        }
        System.out.println(sum);
        System.out.println("Enter the number for table");
        int num =sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num*i);
        }
    }
}
