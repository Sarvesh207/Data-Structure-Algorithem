package com.Apnacollege;

public class CWS_02_Solid_Pattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        //Outer loop
        for (int i = 1; i<=n; i++){
            //inner loop
            for (int j = 1; j<=m; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
