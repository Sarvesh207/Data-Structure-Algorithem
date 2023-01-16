package com.Arrrays.printSprial;
import java.util.*;

public class sprialorder {

    public static void printSprial(int matrix [][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;


        while(startCol <= endCol && startRow <= endRow) {

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j]);
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]);
            }
            //bottom.
            for (int j = endCol - 1; j >= startCol; j--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]);
            }
            //left
            for (int i = endRow - 1; i >= startRow+1; i--) {
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

    }

    public static void sprialapproch2(int matrix[][]){
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        int left = 0;
        int right = m;
        int top = 0;
        int bottom = n;

        while(top <= bottom && left <= right){
            //top
            for (int i = left; i<=right; i++){
                System.out.print(matrix[top][i]+" ");
            }top++;

            //right
            for(int i=top; i<=bottom; i++){
                System.out.print(matrix[i][right]+" ");
            }right--;
            //bottom
            for(int i=right; i<=left; i++){
                System.out.print(matrix[bottom][i]+" ");
            }bottom--;
            //left
            for(int i=bottom; i<=top; i++){
                System.out.print(matrix[i][left]+" ");
            }left++;
        }


    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter no.of rows");
//        int row = sc.nextInt();
//
//        System.out.println("Enter no. colums");
//        int col = sc.nextInt();
//
//        int matrix [] [] = new int[row][col];
//        // taking input
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
        int matrix [] [] = {{1,2,3},
                            {4,5,6,},
                             {7,8,9}};
        //printSprial(matrix);
        sprialapproch2(matrix);

    }
}
