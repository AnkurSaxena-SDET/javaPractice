package stringSpecials;


import java.util.Arrays;

// System.out.println(str4.trim().length());
// System.out.println(str4.length());
//System.out.println(str5.charAt(3));
//System.out.println(str.contains("Wel"));
//System.out.println(s1.equalsIgnoreCase("WELCOME"));
//System.out.println(rep.replace('e','X'));
//System.out.println(str.substring(3,7));
//System.out.println(str.toUpperCase());//WELCOME
//System.out.println(str.toLowerCase());//welcome
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
        System.out.println(rep.replace("selenium", "Playwrite"));
        System.out.println(rep.replace("welcome","bye").replace("selenium","Welcome"));
        System.out.println(str.substring(3,7));//come
        System.out.println(str.substring(0,1));//W

        System.out.println();
        //toupperCase, toLowerCase method
        System.out.println(str.toUpperCase());//WELCOME
        System.out.println(str.toLowerCase());//welcome
        System.out.println();
        //split() - split the string into mulitiple parts based on delimeter
        String email="abc@gmail.com";
        String a[]=email.split("@");
        System.out.println(a[0]);//abc
        System.out.println(a[1]);//@gmail.com
        System.out.println(Arrays.toString(a)); //[abc, gmail.com]
        String amount="$15,20,55";
        System.out.println(amount.replace("$" ,"").replace(",",""));
        String email2="abc,123@xyz";//abc, 123, xyz
        String arr1[]=email2.split(",");
        System.out.println(Arrays.toString(arr1));
        String arr2[]=arr1[1].split("@");
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        //*, %, &, ^,  ( ) ---you can not use as a deliemeters
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
