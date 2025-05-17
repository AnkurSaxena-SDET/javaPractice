package com.company;

import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Plese enter a new sentance");
        String original =sc.nextLine();
        StringBuilder sb =new StringBuilder(original);
        sb.reverse();
        String reverse =sb.toString();
        if(original.equalsIgnoreCase(reverse))
        {
            System.out.println("given word is a palindrome");
        }else{
            System.out.println("given word is not a palindrome");
        }
       System.out.println("given sentence in reverse :"+ reverse.trim());
    }
}
