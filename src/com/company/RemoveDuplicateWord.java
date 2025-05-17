package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class RemoveDuplicateWord {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String original=sc.nextLine();
        String result="";
        String words[]=original.trim().split("\\s+");
        for(int i=0; i<words.length;i++)
        {
           String word= words[i];
           if (!result.contains(" "+word+" ")&&
                   !result.startsWith(word+" ")&&
                   !result.endsWith(" "+ word)&&
                   !result.equals(word)){
               result =result+word+" ";

           }

        }
        System.out.println("duplicate removed " + result.trim());
    }
}
