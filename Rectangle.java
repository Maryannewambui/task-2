package com.mycompany.rectangle;
import java.util.Scanner;
public class Rectangle {
//declare the variables
    static int length, width, area;
    //craeting a method
    public static void rectangle() {
        Scanner input= new Scanner(System.in);
        //enter length
        System.out.println("Enter length of rectangle:");
        length = input.nextInt();
        //enter width
        System.out.println("Enter width of rectangle:");
        width = input.nextInt();
        //calculate area
        area= length * width;
        System.out.println("The area is:"+area);
        
    }
    public static void main(String[] args){
        //calling methods with no parameters
        rectangle();
    }
}
