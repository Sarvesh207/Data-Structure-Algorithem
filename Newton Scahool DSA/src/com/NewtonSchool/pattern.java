package com.NewtonSchool;
import java.util.*;

public class pattern {
    public static void printPattern(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
                //if(i%)
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);


    }
}
