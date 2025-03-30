package arraysProblem;

import java.util.Scanner;

public class AdditionOfTwoArray
{
    public static void main(String[] args) {
        int a[]= new int [5]; int sum=0;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Element in Array");
        for(int i =0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Element");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " " );
            sum =a[i]+sum;
        }
        System.out.println("Sum of Array " + sum );


    }


}
