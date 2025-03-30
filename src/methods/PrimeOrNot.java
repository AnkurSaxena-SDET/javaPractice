package methods;
import java.util.*;
public class PrimeOrNot
{

    public static void main(String[] args)
    {
        int size, i ;
        Scanner r = new Scanner(System.in);
        System.out.println("Please enter the array size");
        size =r.nextInt();
        int a[] =new int[size] ;
        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Please enter the Elements ");
        for (int b: a)
        {
            System.out.print(b +" ");
        }



    }
}
