package com.company;
import java.util.*;
public class HellowRectangle {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter row number");
        int n =sc.nextInt();
        System.out.println("Enter column number");
        int m =sc.nextInt();
         //outer loop
        for (int i =1; i<=n; i++){
            //inner loop
            for (int j =1; j<=m; j++){
                //cell condition (i,j)
             if(i==1 || j==1 || i==n || j==m){
                 System.out.print("*");
             }else {
                 System.out.print(" ");
             }
            }
            System.out.println();
        }

    }
}
