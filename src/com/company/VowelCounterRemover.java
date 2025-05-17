package com.company;
import java.util.Scanner;

public class VowelCounterRemover {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String original=sc.nextLine();
        StringBuilder sb =new StringBuilder();
        int count=0;
        for(int i=0;i<original.length();i++)
        {
            char ch=original.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {

                count++;

            }else{
                sb.append(ch);
            }
        }
        System.out.println("sentence which out vowel:" + sb);
        System.out.println("removed vowel number :" + count);
    }


}
