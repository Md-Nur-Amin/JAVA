package com.mycompany.oop;

import java.util.Scanner;
class Area{
    int length;
    int breadth;

    public void setDim(int l, int b){
        length =l;
        breadth=b;
    }
    public int getArea(){
        return (length*breadth)/2;
    }
}

public class PracticePrblm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length: ");
        int length=sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth=sc.nextInt();
        
        Area obj= new Area();
        
        obj.setDim(length, breadth);
        System.out.println("Area is:"+ obj.getArea());
    }
    
}
