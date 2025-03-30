package methods;
import java.util.*;
public class Factorial{
public static void printFactorial(int n) {
    int factorial = 1;
    if(n<0){
        System.out.println("this is a invalid input");
        return;
    }

    for (int i = n; i >= 1; i--) {
        factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
}
    public static void main(String[] args) {
       Scanner sc  =new Scanner(System.in);
       int n =sc.nextInt();
       printFactorial(n);
    }
}
