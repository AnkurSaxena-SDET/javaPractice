package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class MenuBase {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        int num;
          do {
           int mark =sc.nextInt();
           if(mark>=90 && mark<=100){
               System.out.println("This is Good");
           } else if (mark>=60 && mark<=89) {
               System.out.println("This is also good");
           }else if(mark>=0 && mark<=59){
               System.out.println("This is good as well");
           }else{
               System.out.println("Invalid input");
           }
              System.out.println("Want to Continue ? (yes(1) or no (0))");
           num =sc.nextInt();
          } while (num==1);
    }
}
