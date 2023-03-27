package all;
//Hollow rectangle Patter in java 

import java.util.*;
public class pattren {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n= sc.nextInt();
      
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");  
    }
    
}
}
