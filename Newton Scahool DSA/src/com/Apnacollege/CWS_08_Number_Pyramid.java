package com.Apnacollege;

public class CWS_08_Number_Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i<=n; i++){
            //for -> Spaces
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            // For -> Star
            for (int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
