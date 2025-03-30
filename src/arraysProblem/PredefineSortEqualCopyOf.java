package arraysProblem;
//Sort(), Equals() , copyof()
// --->default static methods hai so call karne ke liye object bananne ki jaruarat nahi padegi.
import java.util.Scanner;
import java.util.Arrays;
public class PredefineSortEqualCopyOf {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter value in Array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
       for(int i=0; i<a.length;i++)
       {
           System.out.print(a[i] +" ");
       }
       //second program
        int a1[]=new int[5];
       int a2[]=new int[5];
        System.out.println("enter data in a1 Array");
        for(int i=0;i<a1.length;i++)

        {
            a1[i]=sc.nextInt();

        }
        System.out.println("enter data in a2 array");
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=sc.nextInt();
        }
        //boolean b =Arrays.equals(a1,a2);
        boolean b=Arrays.equals(a1,a2);
        System.out.println("Kya dono Array equal hai " + b);

    }
}

