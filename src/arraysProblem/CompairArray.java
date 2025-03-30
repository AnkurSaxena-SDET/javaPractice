package arraysProblem;

import java.util.Arrays;
//== and equal mie differance == method only compair a=a name of array not data like a!==b only a==b
public class CompairArray {
    public static void main(String[] args) {

        int a[]={10,20,30,40,50};
        int b[]={10,20,30,40,50};
        if(a==b)
        {
            System.out.println("both array are equal");
        }else {
            System.out.println("Both array are not equals");
        }

        if(Arrays.equals(a,b))
        {
            System.out.println("both array are now equal");
        }else{
            System.out.println("both array are now not equal");
        }

    }
}
