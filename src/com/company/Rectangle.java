package com.company;

import java.util.*;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter row number");
        int n =sc.nextInt();
        System.out.println("Please enter column number");
        int m =sc.nextInt();
        // outer loop
        for(int i =1; i<=n; i++){
            //inner loop
            for( int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
