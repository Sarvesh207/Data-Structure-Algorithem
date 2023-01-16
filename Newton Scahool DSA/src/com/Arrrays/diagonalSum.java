package com.Arrrays;

public class diagonalSum {
   /* public static int  diagonalsum(int arr [][]){
        int n = arr.length;
        int m = arr[0].length;
        int sum =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i == j){

                     sum += arr[i][j];
                }else if(i+j == arr.length-1){

                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    */
    // optmized approch
    public static int caldiagonalSum(int [][] arr){
        int sum =0;
        for(int i=0; i< arr.length; i++){
            //ps
            sum += arr[i][i];
            //ss
            if(i != arr.length-1-i)
            sum += arr[i][arr.length-1-i];

        }
        return sum;
    }
    public static void main(String[] args) {
        int arr [] [] = {{1,2,3,4},
                         {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        System.out.println(caldiagonalSum(arr));
    }
}
