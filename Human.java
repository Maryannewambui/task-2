
package com.mycompany.question4;

public class Human {
    String name;
    int age;
    
    Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    void eat(){
        System.out.println(this.name+" is eating");
    }
}
