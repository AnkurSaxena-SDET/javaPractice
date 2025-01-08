package com.company;

import java.util.Scanner;

public class CWE_problemSolve {
    public static void main(String[] args) {
        System.out.println("Please enter your marks subject wise");
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter subject 1 marks");
        float sub1 =sc.nextFloat();
        System.out.println("Please enter subject 2 marks");
        float sub2 =sc.nextFloat();
        System.out.println("Please enter subject 3 marks");
        float sub3 = sc.nextFloat();
        System.out.println("Please enter subject 4 marks");
        float sub4 = sc.nextFloat();
        System.out.println("Please enter subject 5 marks");
        float sub5 = sc.nextFloat();
        double total_marks = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total marks in all subjects: " + total_marks);
        System.out.println("Please enter maximum marks in each subject");
        int max_marks =sc.nextInt();
        int final_marks =max_marks*5;
        double PercentMarks = (total_marks *100)/final_marks;
        System.out.println("Percentage of all Subject marks: " + PercentMarks +"%");



    }
}
