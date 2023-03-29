package com.mycompany.oop;

class Student{
    String name;
    int roll_no;
}

public class practicePrblm2 {
    public static void main(String[] args) {
        Student s1= new Student();
        
        s1.name="john";
        s1.roll_no=2;
        
        System.out.println(s1.name+"\n"+s1.roll_no);
    }
}
