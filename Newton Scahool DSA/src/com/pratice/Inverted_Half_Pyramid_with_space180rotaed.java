package com.pratice;

public class Inverted_Half_Pyramid_with_space180rotaed {
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for (int i = 1; i<=n; i++){
            //1st -> innner loop for space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //2nd -> inner loop for Star
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
