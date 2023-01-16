package com.NewtonSchool;

import java.util.Scanner;

public class Pattern_with_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int row = 1;row <= n; row++){
            for (int i = 1; i <= row; i++){
                System.out.print("*");
            }
//enter new line
            System.out.println( );
        }

    }
}
