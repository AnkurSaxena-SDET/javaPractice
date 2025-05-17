package practies;

import java.util.Scanner;

public class ASICValue {
    public static void main(String[] args) {
        char ch;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a character");
        ch =sc.next().charAt(0);
        int a=ch;
        System.out.println("ASCII value of " +ch + " is " + a);
    }
}
