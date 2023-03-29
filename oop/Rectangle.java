package com.mycompany.oop;
/*create class name rectangle with two datamembers - lenght and breadth and a method 
to calculat the area which is lenght *breadth. 
The class has three constructors which are :
i. Having no parameter - values of both lengh and breadth are assigned zero.
ii. Having two numbers as parameters - the two numbers are assigned as lengh and breadth respectively.
iii. Having one number as parameter - both length and breadth are assigned that number.

Now create object of the 'rectangle' class having none
one and two parameters and print their ares.*/
class rectangle{
    int length;
    int breadth;
    
    public void calculate(){
        System.out.println(length*breadth);
        
    }
}
public class Rectangle {
    public static void main(String[] args) {
        rectangle Rect1 = new rectangle();
        
        Rect1.length=10;
        Rect1.breadth=5;
        Rect1.calculate();
    }
    
}
