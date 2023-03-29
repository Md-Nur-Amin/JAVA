package com.mycompany.oop;

public class MyApplication {
    int a;
    String b;
    MyApplication(){
        
        System.out.println("ABC");
    }
    
    public static void main(String[] args) {
        MyApplication obj= new MyApplication();
        System.out.println(obj.a+"\n"+ obj.b);
    } 
}