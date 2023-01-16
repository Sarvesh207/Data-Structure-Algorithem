package com.Apnacollege;

import java.sql.SQLOutput;

public class CWS_07_Butterfly_Pattern {
    public static void main(String[] args) {
        int n = 4;
        //for upper Half
        for (int i = 1; i<=n; i++){
            //For Star
            for (int j = 1; j<=i; j++ ){
                System.out.print("*");
            }
            // For Spaces
            int space = 2*(n-i);
            for (int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
           //for Lower Half
        for (int i = n; i>=1; i--){
            //For Star
            for (int j = 1; j<=i; j++ ){
                System.out.print("*");
            }
            // For Spaces
            int space = 2*(n-i);
            for (int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
