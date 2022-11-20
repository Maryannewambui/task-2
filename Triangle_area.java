package com.mycompany.triangle_area;
import java.util.Scanner;
public class Triangle_area {
    int base, height;  //declaring non-static variables
    static int trianglearea; // declare static method
    public static void main(String[] args) //main method
    {
        Triangle_area Triangle1= new Triangle_area(); //create triangle1 object
        Triangle1.getInput();     //nonstatic method through triangle1 object
        Triangle1.SetArea();     //nonstatic method through triangle1 object
        Triangle1.outputArea();  //nonstatic method through triangle1 object
    }
    
public void getInput() //non static method
    {
        //start
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        base =input.nextInt();
        System.out.println("Enter the height of the triangle");
        height =input.nextInt();
    }
    //end
    public int SetArea()//non-static method
    {
        trianglearea= (base*height)/2; //non-static variable for trianglearea
        return trianglearea;       //return non-static variable
    }
    public static void outputArea() //define non-static method
    {
        System.out.println("the area of the triangle is:"+trianglearea); //access non-static variable
    }
            
}
