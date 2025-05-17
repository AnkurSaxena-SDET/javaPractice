package com.company;

public class ReversedSentence {
    public static void main(String[] args) {
        String sentence = "i love automation";
        String reverseSentence = "";
        String words[] = sentence.split(" ");
        for (int i = words.length - 1; i >=0; i--) {
            reverseSentence = reverseSentence + words[i] + " ";
        }
        System.out.println("Reverse Sentence is :" + reverseSentence);
    }
}
