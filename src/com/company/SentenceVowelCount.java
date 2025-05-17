package com.company;

public class SentenceVowelCount {
    public static void main(String[] args){
        String sentence="i love automation";
        int count =0;
        sentence =sentence.toLowerCase();
        for(int i =0; i<sentence.length();i++)
        {
            char ch =sentence.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
             count++;
            }
        }
        System.out.println("Total vowel in i love automation:" + count );
    }
}
