package com.mycompany.year_average;
import java.util.Scanner;

public class Year_average {
      static int year;
    //create a method
    public static void main(String[] args){
     
    	Scanner input= new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = input.nextInt();
    	input.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                isLeap = year % 400 == 0;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
    
}
