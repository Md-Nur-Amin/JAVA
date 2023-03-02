package array;

import java.util.Scanner;

public class arrayMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for array1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter m for array1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter n for array2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter n for array2: ");
        int m2 = sc.nextInt();
        
        if(n1 != m2) {
            System.out.println("Invalid input:");
            return;
        }
                  
        int[][] arr1 = new int[n1][m1];
        int[][] arr2 = new int[n2][m2];
        int[][] multiple = new int[n1][m2];

        System.out.println("Enter the elements of the array1:");
        for (int i = 0; i < n1; i++) {
            for(int j=0; j<m1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the array2:");
        for (int i = 0; i < n2; i++) {
            for(int j=0; j<m2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array1:");
        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Array2:");
        for(int i=0; i<n2; i++){
            for(int j=0; j<m2; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
        // multiply arrays
        for(int i=0; i<n1; i++){
            for(int j=0; j<m2; j++){
                for(int k=0; k<m1; k++){
                    multiple[i][j] = multiple[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Result:");
        for(int i=0; i<n1; i++){
            for(int j=0; j<m2; j++){
                System.out.print(multiple[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
