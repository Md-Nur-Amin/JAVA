package com.mycompany.oop;

class Car{
    int seats;
    int wheel;
    String color;
    void applyBrake(){
        System.out.println("Break has been applied");
    }
    void increaseSpeed(){
        System.out.println("Not Increased!");
    }
}

public class CTSolve {
    public static void main(String[] args) {
        Car Sedan= new Car();
        Car Coupe =new Car();
        
        Sedan.seats=5;
        Sedan.color="Blue";
        System.out.println(Sedan.seats + "\n"+Sedan.color);
        Sedan.applyBrake();
        
        Coupe.seats=4;
        Coupe.wheel=4;
        System.out.println(Coupe.seats+"\n\n"+Coupe.wheel);
        Coupe.increaseSpeed();
    }
}
