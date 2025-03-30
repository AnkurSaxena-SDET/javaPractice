package methods;
import java.util.*;
public class MethodPractice {
   /*public static void printMyName(String name){
       System.out.println(name);
       return;
    }*/
    public static int calculateSum(int a , int b){
        int sum= a+b;
        return sum;
    }

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      //String name =sc.nextLine();
      //printMyName(name); // call kiya function ko
        System.out.println("please enter first number");
        int a =sc.nextInt();
        System.out.println("Please enter second Number");
        int b =sc.nextInt();
        int sum =calculateSum(a,b);
        System.out.println("Sum of two numbers: " +sum);

    }
}
