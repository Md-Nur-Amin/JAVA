package com.mycompany.oop;

class A{
    int i;
    String s;
    boolean b;
    
    void A(){
        i=123;
        s= "GUB";
        b= true;
    }
    void print(){
        System.out.println("i="+ i+" s="+s+" b=" +b);
    }
}

public class Main {
    public static void main(String[] args) {
        A ob= new A();
        ob.print();
    }
}
