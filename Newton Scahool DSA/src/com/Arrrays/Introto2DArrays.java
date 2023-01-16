package com.Arrrays;

public class Introto2DArrays {
    public  static void display(int arr[] []){
        //this loops will run for all rows
        for (int row = 0; row < arr.length; row++){

            //print 1 row
            for (int col = 0; col <arr[row].length; col++){
                System.out.print(arr[row] [col] +" ");
            }
            // print empty line after each row
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr [] [] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                };
        display(arr);
      }
}
