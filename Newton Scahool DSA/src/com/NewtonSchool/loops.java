package com.NewtonSchool;

import java.util.Scanner;
// for calculating foctorial
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nfact = 1;
        for (int i = 1; i <= n;i++){
            nfact = nfact*i;

        }
        System.out.println(nfact);
    }
}
