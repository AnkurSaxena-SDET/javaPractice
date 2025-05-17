package practies;

import java.util.Scanner;

public class AlphabetsPrints {
    public static void main(String[] args) {
        for(char cha='A'; cha<='Z';cha++ )
        {
            System.out.print(cha +" ");
        }
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter first number");
        System.out.println("Please enter second number");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println(a +" is greater number");

        }else if(b>a){
            System.out.println(b +" is greater number");
        }else{
            System.out.println("both number are same");
        }


    }
}
