package com.Apnacollege;

public class CWS_06_Solid_Rhombus {
    public static void main(String[] args) {
        int n = 5;

        //Outer loop
        for (int i = 1 ; i<=n; i++){
            //Inner loop for -> Space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop for  -> Star
            for (int j = 1; j<=n; j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
