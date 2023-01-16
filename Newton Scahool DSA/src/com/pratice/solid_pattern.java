package com.pratice;

public class solid_pattern {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        for (int i = 1; i<=n; i++){
               //fot Star
            for (int j = 1; j<=m; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
