package com.Apnacollege;
import java.util.*;

public class array2D_Transpose_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
        int N = sc.nextInt();
        int matrix [][] = new int[N][N];
        //for-> Input
        for (int i = 0; i<N; i++){
            for (int j = 0; j<N; j++){
                matrix [i][j] =sc.nextInt();
            }
        }
        //for-> output Transpose of matrix
        for(int j = 0; j<N; j++){
            for (int i = 0; i<N; i++){
                System.out.print
                        (matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
