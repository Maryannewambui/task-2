package com.mycompany.marks;
import java.util.Scanner;
public class Marks {
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //declare variable
        Double java_marks, net_marks, math_marks;
        System.out.println("Enter java programming marks:");
        java_marks= input.nextDouble();
        System.out.println("Enter java networking marks:");
        net_marks= input.nextDouble();
        System.out.println("Enter math marks:");
        math_marks= input.nextDouble();
        System.out.println("The average is:"+average(java_marks, net_marks, math_marks)+"\n");
    }
    public static double average(double java_marks,double net_marks, double math_marks)
            {
                return(java_marks + net_marks + math_marks)/3;
            }
}
