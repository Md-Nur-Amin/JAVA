package com.mycompany.oop;

import java.util.Scanner;
public class methodOverloading {
    void callmethod(int a, int b){
        System.out.println(a+" "+b);
    }
    void callmethod(double c){
            System.out.println(c);
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        double c= sc.nextDouble();
        
        new methodOverloading().callmethod(a, b);
        new methodOverloading().callmethod(c);
    }  
}
