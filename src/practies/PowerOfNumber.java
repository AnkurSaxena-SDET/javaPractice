package practies;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n, p, power=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number");
        n=sc.nextInt();
        System.out.println("Please enter a power of number");
        p=sc.nextInt();
        for(int i=1;i<=p;i++)
        {
            power=n*power;
            System.out.print(power+" ");

        }
        System.out.println("power of "+ n + " is " +power);
    }
}
