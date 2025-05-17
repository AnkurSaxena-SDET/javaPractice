package practies;

public class VowelCounter {
    public static void main(String[] args){
        String n="poonam";
        int count =0;
        for(int i =0; i<n.length();i++)
        {
            char ch =n.charAt(i);
           if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')
           {
               count++;
           }

        }
        System.out.println("Total vowel in poonam: " + count);
    }
}
