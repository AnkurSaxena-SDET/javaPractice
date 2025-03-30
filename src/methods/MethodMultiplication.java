package methods;
import java.util.*;
public class MethodMultiplication {
    public static int multiCalculated(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();

        System.out.println("Multiplication of two numbers: "+ multiCalculated(a,b));
    }
}
