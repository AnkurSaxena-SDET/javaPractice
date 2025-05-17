package practies;

import java.util.Scanner;

public class SalaryTaxCalculation {
    public static void main(String[] args) {
        int sal;
        double tax;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Please Enter Salary");
        sal=sc.nextInt();
        if(sal<=10000){
            System.out.println(sal + " No tax on salary");
        }else if(sal>10000 && sal<=100000){
            tax=sal*0.10;
            System.out.println(sal +" tax on salary "+tax);
        }else{
            tax =sal*0.20;
            System.out.println(sal + " "+tax );
        }


    }
}
