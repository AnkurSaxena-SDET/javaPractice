package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class JavaCollection {
    public static void main(String[] args){
        ArrayList <String> name =new ArrayList<String>();
        name.add("Ankur");
        name.add("Anup");
        name.add("Sonu");
        System.out.println(name);
        name.add(1,"Rishabh");
        System.out.println(name);
        name.add("papppu");
        System.out.println(name);
        name.remove(2);
        System.out.println(name);
        name.set(1,"pagal");
        System.out.println(name);

        System.out.println(name.get(3));
        name.clear();
        System.out.println(name);
        LinkedList<String> alllist =new LinkedList<String>();

        alllist.addFirst("tony Stak");
        alllist.addLast("Hulk");
        alllist.removeFirst();
        alllist.removeLast();
        System.out.println(alllist);
    }
}
