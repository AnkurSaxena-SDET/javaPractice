package practies;

import java.util.Scanner;

public class ConvertAlphabet {

    public static void main(String[] args){
      char ch, ch2, ch3;
        System.out.println("Please enter a character");
      Scanner sc =new Scanner(System.in);
      ch=sc.next().charAt(0);
      if(ch>'A' && ch<'Z')
      {
          ch2=Character.toLowerCase(ch);
          System.out.println(ch2);
      }else{
          ch3=Character.toUpperCase(ch);
          System.out.println(ch3);
      }

    }
}
