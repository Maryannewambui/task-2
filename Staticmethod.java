package com.mycompany.question4;
import java.util.Scanner;
public class Staticmethod {
    //declaring static variables
    public static void main(String[] args)
    {
        int f_1, f_2, sum;
        Scanner input=new Scanner(System.in);
        //enter the first static number
        System.out.println("Enter the first number:");
        f_1= input.nextInt();
         //enter the second static number
        System.out.println("Enter the second number:");
        f_2= input.nextInt();
        
        sum =f_1 + f_2;
        System.out.println("Sum of the numbers is:"+sum);
        
    }
}
