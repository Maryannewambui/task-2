
package com.mycompany.question4;

public class Nonstaticmethod {
    public void display()
    {
        System.out.println("This is a non static method");
    }
    public static void main(String[] args)
    {
        Nonstaticmethod obj=new Nonstaticmethod();
        //it will display what is entered
        obj.display();
    }
}
