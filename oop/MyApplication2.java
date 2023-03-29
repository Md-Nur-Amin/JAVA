package com.mycompany.oop;

public class MyApplication2 {
    int a;
    String b;
    
    MyApplication2(int id, String name ){
        a= id;
        b= name;
        
    }
    public static void main(String[] args) {
        MyApplication2 obj= new MyApplication2(123,"Nur Amin");
        
        System.out.println(obj.a);
        System.out.println(obj.b);
        
    
    }
    
}
