package arraysProblem;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        int a[]=new int [5]; double avg ; int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter element of Array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("Array Elements");
        for(int i=0;i<a.length;i++)
        {
            sum=a[i]+sum;

        }
        avg=sum/a.length;
        System.out.println(" sum of array " + sum);
        System.out.println(" avg of array " + avg);

    }
}
