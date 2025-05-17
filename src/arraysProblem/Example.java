package arraysProblem;

public class Example {

    public static void main(String[] args) {

       String original = "poonam";
       String reversed = "";

       for(int i=original.length()-1;i>=0;i--)
       {
           reversed =reversed +original.charAt(i);
       }
        System.out.println("reversed of poonam :" + reversed);
       if(original.equals(reversed))
       {
           System.out.println("poonam is a palindrome");
       }else{
           System.out.println("poonam is not a palindrome");
       }
}
}