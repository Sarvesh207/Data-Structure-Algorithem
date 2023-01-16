package com.pratice;

public class Print_Rombhus {
    public static void main(String[] args) {
        int n = 5;
        //Outer loop
        for (int i = 1; i<=n; i++){
            //for space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for Star
            for (int j = 1; j<=n; j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}
