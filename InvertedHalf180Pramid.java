package com.company;

public class InvertedHalf180Pramid {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        for (int i =1; i<=n; i++){
            // first inner loop -- print space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //second inner loop for star print
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
