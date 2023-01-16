package com.Apnacollege;

public class CWS_04_half_pyramid_with_space {
    public static void main(String[] args) {
        int n = 4;

        //Outer loop
        for (int i = 1; i<=n; i++){
            //Inner loop for -> space
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //Inner loop for -> Star
            for (int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
