package com.mycompany.oop;

class Student{
    int roll;
    String name;
    static String college="ABC";
    
    static void change(){
        college="XYZ";
    }

    Student(int r, String n){
        roll= r;
        name=n;
    }
    
    void display(){
        System.out.println(roll+" "+name+" "+college);
    }
}

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        
        Student s1= new Student(111,"k");
        Student s2= new Student(222,"B");
        Student s3= new Student(333,"C");
        
        s1.display();
        s2.display();
        s3.display();
    }
}
