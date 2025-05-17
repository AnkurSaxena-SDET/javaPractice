package com.company;

import java.util.Scanner;

public class ScannerReverseSentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String original =sc.nextLine();
        String reversed="";
        String word[]=original.trim().split("\\s+");
        for(int i=word.length-1;i>=0;i--)
        {
            reversed=reversed+word[i] +" ";

        }
        System.out.println("Reversed of given sentence "+ reversed);
    }
}
