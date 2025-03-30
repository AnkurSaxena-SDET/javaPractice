package stringSpecials;



// System.out.println(str4.trim().length());
// System.out.println(str4.length());
//System.out.println(str5.charAt(3));
//System.out.println(str.contains("Wel"));
//System.out.println(s1.equalsIgnoreCase("WELCOME"));
public class StringMethods {
    public static void main(String[] args) {
        String s="Welcome";
        System.out.println(s.length());

        //Second method string class object
        String str=new String("Welcome");
        System.out.println(str.length());
        //thrid method
        System.out.println("Welcome".length());

        //concat methods joining strings +
        String str1="Welcome";
        String str2="to Java";
        String str3="in Automation";
        System.out.println(str1 +" "+ str2 +" "+str3);
        System.out.println(str1.concat(str2).concat(str3));
        // 3rd Method trim()
      String str4="     welcome    ";
        System.out.println(str4);
        System.out.println(str4.trim());
        System.out.println(str4.trim().length());
        System.out.println(str4.length());

        // charter feathering from String  --->charAt()
        String str5 ="Ankur";
        System.out.println(str5.charAt(3));//u
        System.out.println(str.charAt(0));//W

        // contain() ---> always return boolean value and also fellow Case Sensitive
        System.out.println(str5.contains("ku"));//True
        System.out.println(str.contains("Wel"));//true
        System.out.println(str.contains("wel"));//false
        System.out.println(str.contains("Welme"));//flase

       // equals()--->case senstive , equalsIgnoreCase() - compare strings
        String s1="welcome";
        String s2="welcome";
        System.out.println(s1.equals(s2));// true
        System.out.println(s2 == s1);//true
        System.out.println(s1.equalsIgnoreCase("WELCOME"));//true

        //replace()-->single and replaceMultiple(sequence)of character in a string

        String rep="welcome to java selenium selenium python selenium c#";
        rep.replace('e','X');
        System.out.println(rep.replace('e','X'));
        char target='e';
        int count1=0;
        int count2=0;
        for(int i=0;i<rep.length();i++)
        {
          if(rep.charAt(i)==target)
          {
             count1++;
          }
        }
        System.out.println("count of e in String = "+ count1 );

        String vowels="aeiouAEIOU";
        for(int i=0;i<rep.length();i++)
        {
            if(vowels.indexOf(rep.charAt(i))!=-1)
            {

                count2++;
            }
        }
        System.out.println(" Total number of vowels  " + count2);
    }
}
