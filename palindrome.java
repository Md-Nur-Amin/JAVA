package all;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word or string to check: ");
        String str= sc.nextLine();
        String rev="";
        int len= str.length();

        for(int i=len-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.print(str+ " is Palindrome");
        }
        else{
            System.out.println(str+ " Not Palindrome");
        }
    }
}
