package com.company;

import java.util.Scanner;

public class CharPrint {
    public static void main(String[]args){
        char ch;
        System.out.println("Please Enter a character");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println(ch);
        if (ch =='a' ||  ch=='e' ||  ch=='i' || ch=='o' ||  ch=='u')
        {    System.out.println("character is vowel");

        }
        else{
            System.out.println("character is consonant");
        }
        int a=ch;
        System.out.println("ASCII Value of character: " + ch +" is "+ a);
    }
}
