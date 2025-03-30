package arraysProblem;

import java.util.Scanner;

public class InsertItemInArray {
    public static void main(String[] args) {
       int size,loc,item,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array");
        size=sc.nextInt();
        int a[]=new int[size+1];
        System.out.println("Please enter value in Array");

        for (i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Array Location");
        loc=sc.nextInt();

        System.out.println("Enter new Item");
        item=sc.nextInt();

        for(i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }

        for(i=size;i>loc;i--)
        {
         a[i]=a[i-1];
        }

        for(i=0;i<size;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}
