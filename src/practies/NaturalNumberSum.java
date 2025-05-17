package practies;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=i+sum;
            System.out.print(i + " ");
        }

        System.out.println("Sum of natural Numbers : " +sum);

    }
}
