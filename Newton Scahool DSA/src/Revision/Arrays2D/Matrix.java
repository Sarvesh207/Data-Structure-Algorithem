package Revision.Arrays2D;

import java.util.Scanner;

public class Matrix {

    public static boolean isPresent(int mat[][],int k){
        for(int i=0; i< mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
               if( mat[i][j] == k){
                   System.out.println("found at index "+ i+" , "+j);
                   return true;
               }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix [][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();

            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        isPresent(matrix, 10);
    }

}
