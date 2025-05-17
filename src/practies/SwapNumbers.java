package practies;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter Two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swapping "+ a + " "+b);
       temp=a;
       a=b;
       b=temp;
        System.out.println("After Swapping " +a+" "+b);

       //without using third variable
        int i,j;
        System.out.println("Please enter again two numbers");
        i=sc.nextInt();
        j=sc.nextInt();

        System.out.println("Before Swapping "+ i+ " "+j);
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println("After Swapping "+ i+ " "+j);



    }
}
