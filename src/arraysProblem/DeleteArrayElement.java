package arraysProblem;

import java.util.Scanner;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int size,i,loc,ß;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        size = sc.nextInt();
        int a[]=new int[size];
        System.out.println("Please enter Array Elements");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Array Location" );
        loc=sc.nextInt();
       for(i=loc;i<size-1;i++)
       {
           a[i]=a[i+1];
       }
       size--;
        for(i=0;i<size;i++)
        {
            System.out.print(a[i] +" ");
        }
    }
}
