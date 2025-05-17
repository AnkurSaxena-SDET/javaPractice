package com.company;
import java.util.Scanner;
public class CountWordInSentence {
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence=sc.nextLine();
        String word[]=sentence.trim().split("\\s+");
        System.out.println("word count : "+ word.length);

    }
}
