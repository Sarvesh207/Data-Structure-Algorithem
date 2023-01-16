package com.pratice;

public class Solid_Reactangle_Pattern {
    public static void main(String[] args) {
        int n = 5;

        //for-> space
        for (int i = n-1; i>1; i-- ){
            for (int j = i; j<n-i; j++){
                System.out.print(" ");
            }
        }

            //for->Star
        for (int i  = 1; i<n; i++){
            for (int j = 1; j<n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
