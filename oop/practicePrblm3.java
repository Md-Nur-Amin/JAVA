package com.mycompany.oop;

class Student{
    String name;
    String address;
    int roll_num;
    int phone;
}

public class practicePrblm3 {
    public static void main(String[] args) {
        Student sam= new Student();
        Student john=new Student();
        
        sam.name="Sam";
        sam.address="Baridhara";
        sam.roll_num=221;
        sam.phone=123;
        System.out.println(sam.name+" "+sam.address+" "+sam.phone+" "+sam.roll_num);
        
        john.name="John";
        john.address="Mirpur";
        john.roll_num=222;
        john.phone=321;
        System.out.println(john.name+" "+john.address+" "+john.phone+" "+john.roll_num);
    }
}
