package com.CodewithHarry;

public class CWS_10_2D_Arrays {
    public static void main(String[] args) {
        int marks [] = new int[5];           // 1D array
        int flats [][]= new int[2][3];
        flats[0][0]= 101;
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 104;
        flats[1][1]= 105;
        flats[1][2]= 106;

        //Displaying 2d arrays using for loop
        System.out.println("P");
        for (int i = 0; i<flats.length; i++){
            for (int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");

        }
    }
}
