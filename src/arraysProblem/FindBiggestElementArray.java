package arraysProblem;

import java.util.Scanner;

public class FindBiggestElementArray {
    public static void main(String[] args) {
        int max,min,size;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter array size value");
        size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
       max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Biggest Element is " + max);

        min =a[0];
        for(int i=1; i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("smallest Element is " + min);
    }
}
