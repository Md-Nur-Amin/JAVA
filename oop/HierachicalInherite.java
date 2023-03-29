package com.mycompany.oop;

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}

public class HierachicalInherite {
    public static void main(String[] args) {
        
        Cat c= new Cat();
        c.eat();
        c.meow();
        
        Dog d= new Dog();
        d.eat();
        d.bark();

    }
}
