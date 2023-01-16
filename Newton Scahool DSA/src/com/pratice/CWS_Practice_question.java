package com.pratice;
import java.util.*;


public class CWS_Practice_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i += 1){
            for (int j = 1; j<=i; j += 1){
                System.out.print(j*4);
                System.out.print(" ");
            }
           System.out.println(" ");
        }



    }
}
