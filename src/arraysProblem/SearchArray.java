package arraysProblem;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        int a[]=new int[5];int element,count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array element");
        for(int i=0; i<a.length;i++)
        {
         a[i]=sc.nextInt();
        }
        System.out.println("Array Element");
        for(int i=0; i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
        System.out.println("Enter Search Element");
        element=sc.nextInt();
        for (int i=0;i<a.length;i++) {
            if (a[i] == element) {
                count++;
            }
        }
            if (count>0)

            {
                System.out.println("Element Found " + count+ " times");
            }else{
                System.out.println("Element not found");
            }

    }
}
