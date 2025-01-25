package com.company;

public class Looping
{
    public static void main(String[] args) {
        for (int counter =0; counter < 3; counter=counter+1){
            System.out.println("Hello World");
        }
        for (int a=0; a<5;a++){
            System.out.print(a + " ");
        }
        int i=0;
        while (i<8){
            System.out.println(i);
            i++;
        }
        int j=0;
        do {
            System.out.println(j);
            j++;
        } while(j<11);
    }
}
