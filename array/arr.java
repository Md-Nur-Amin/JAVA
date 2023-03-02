import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered array is:");
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println("");
        }
    }
}





