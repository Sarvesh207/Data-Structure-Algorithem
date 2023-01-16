package com.Arrrays;
import java.util.*;

public class Outer_BorderofMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Matrix");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int Matrix2d [] [] = new int[n][m];
        //input of Matrix
        for (int i = 0; i<n; i++){
            for (int j=0; j<m; j++){
                Matrix2d [i][j] = sc.nextInt();
            }
        }
        //output of matrix
        for (int i=0; i<Matrix2d.length; i++){
            for (int j=0; j<Matrix2d.length; j++){
                System.out.print(Matrix2d[i][j]+" ");
            }
            System.out.println();
        }
        // print the outer border of matrix
        for (int i=0; i<Matrix2d.length; i++){
            for (int j=0; j<Matrix2d.length; j++){
                if (i==0 || j==0 || i == n-1 || j==m-1){
                    System.out.print(Matrix2d[i][j]+" ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
