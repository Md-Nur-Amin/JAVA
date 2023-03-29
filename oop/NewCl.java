package com.mycompany.oop;
class Student{
    String s_name;
    int s_age;
    
    public void printInfo(){
        System.out.println(this.s_name +"\n"+this.s_age); 
    }
    
    Student(String name, int age){
        this.s_name= name;
        this.s_age= age;
        
    }
}
public class NewCl {
    public static void main(String[] args) {
       Student s1= new Student("Nur Amin", 22);
       
       s1.printInfo();
    }
}