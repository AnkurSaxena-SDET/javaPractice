package StararraysProblem;

public class StarPattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) //rows
        {

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int n = 4, m = 5;
        for (i = 1; i <=n; i++) {
            //inner loop
            for (j = 1; j <=m; j++) {
                //cell-->(i,j)
                if (i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for(i=m;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
       for(i=1;i<=m;i++)
       {
           for(j=1;j<=i;j++)
           {
               System.out.print(j +" ");
           }
           System.out.println();
       }
        System.out.println();

       for(i=1;i<=m;i++)
       {
           for(j=1;j<=m-i+1;j++)
           {
               System.out.print(j+" ");
           }
           System.out.println();
       }
        System.out.println();
       int number=1;
       for(i=1;i<=m;i++)
       {
           for(j=1;j<=i;j++)
           {
               System.out.print(number +" ");
               number++;
           }
           System.out.println();
       }
        System.out.println();

       for(i=1;i<=m;i++)
       {
           for(j=1;j<=i;j++)
           {
               int sum=i+j;
               if(sum%2==0) {          //even then 1
                   System.out.print(1);
               }else{
                   System.out.print(0);
               }
           }
           System.out.println();
       }
    }
}



