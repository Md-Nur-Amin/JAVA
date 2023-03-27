package all;

import java.util.*;
public class JavaCondition {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num= sc.nextInt();
        System.out.println("Number is: " +num);
        if(num%2==0)
        {
            System.out.printf("%d is Even Number", + num );
        }
        else{
            System.out.printf("Odd Number");
        }
    }

    
}
