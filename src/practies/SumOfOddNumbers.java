package practies;
import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int n, sum=0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        n=sc.nextInt();
        if(n%2==0)
        {
            for(i=0;i<=n;i=i+2){
                System.out.print(i +" ");
                sum =i+sum;

            }

            System.out.println("Sum of even number : "+ sum);
        }else{
            for(i=1;i<=n;i=i+2){
                System.out.println(i +" ");
                sum=i+sum;
            }
            System.out.println("Sum of odd number : " + sum );

        }

    }
}
