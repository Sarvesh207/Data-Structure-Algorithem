package com.Apnacollege;
import java.util.*;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int row = sc.nextInt();
       int col = sc.nextInt();
       int matrix2D [][] = new int[row][col];
       //for-> input
        //row
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
               matrix2D [i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter a number to search in the matrix");
        int x = sc.nextInt();
        //for -> output
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
               if(matrix2D[i][j] == x){
                   System.out.println("The given number is present at indices ("+i+","+j+")");
               }
            }

        }
    }
}
