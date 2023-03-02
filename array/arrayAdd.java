package array;
import java.util.Scanner;
public class arrayAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int sum[][]= new int[n][m];

        System.out.println("Enter the elements of the array1:");
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the array2:");
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array1:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Array2:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                sum[i][j]=arr1[i][j]+ arr2[i][j];
            }
        }

        System.out.println("Sum is:");
        for (int i = 0; i < n; i++) {
            for(int j=0; j<m; j++){
                System.out.print(sum[i][j] + " "); 
            }
            System.out.println("");
        }
    }
}