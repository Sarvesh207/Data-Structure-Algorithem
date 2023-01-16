package Mock_Question;

import java.util.Scanner;

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 *
 * 1 2 3
 *
 * 4 5 6
 *
 * 7 8 9
 *
 * Output: [1,2,3,6,9,8,7,4,5]
 */


public class sprialorder {
    public static void printSprial(int matrix [][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix[0].length-1;
        int endcol = matrix.length-1;
        while(startrow <= endrow && startcol <= endcol){
            //left to right
            for(int i = startcol; i<=endcol; i++ ){
                System.out.print(matrix[startrow][i]+" ");
            }
            startrow++;
            //top to bottom
            for(int i= startrow; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            endcol--;
            // right to left
            for(int i=endcol; i>=startcol; i--){
                System.out.print(matrix[endrow][i]+" ");
            }
            endrow--;
            // botom to top
            for(int i=endrow; i>startcol; i--){
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
        }
    }
    public static void main(String[] args) {
        int matrix [] [] = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        printSprial(matrix);
    }
}
