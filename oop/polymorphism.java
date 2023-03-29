package com.mycompany.oop;

class Student{
    String name;
    int age;
    
    public void printInfo(String name){
        System.out.println(name);
    }
    
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+ " " +age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Nur Amin";
        s1.age=22;
        
        System.out.println(s1.name +" "+ s1.age);
        
    }  
}
