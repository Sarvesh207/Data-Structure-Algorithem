package com.pratice;

import java.util.Scanner;

public class Practice4_halfpyramid_with_spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i= 1; i<=n; i++){
            //for spces
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for star
            for (int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }
}
