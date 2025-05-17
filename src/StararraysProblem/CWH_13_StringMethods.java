package StararraysProblem;

import java.sql.SQLOutput;

public class CWH_13_StringMethods {
    public static void main(String[] args) {
        String str= "Ankur is good boy";
        int value;
        value= str.length();
        String lstring =str.toLowerCase();
        System.out.println(value);
        System.out.println(lstring);
         String ustring =str.toUpperCase();
        System.out.println(ustring);

         String nstring= str.trim();
        System.out.println(nstring);
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,9));
        System.out.println(str.replace('d','u'));
        System.out.println(str.replace("Ank", "rrt"));
        System.out.println(str);
        System.out.println(str.startsWith("Ank"));
        System.out.println(str.endsWith("boy"));
        System.out.println(str.charAt(7));
        System.out.println(str.indexOf("ru"));
    }
}
