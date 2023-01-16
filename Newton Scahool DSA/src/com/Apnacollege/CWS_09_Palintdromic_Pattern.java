package com.Apnacollege;

public class CWS_09_Palintdromic_Pattern {
    public static void main(String[] args) {
        int n = 5;
        //Upper loop
        for (int i = 1; i<=n; i++){
            //for-> spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for -> 1st Half
            for (int j = i; j>=1; j--){
                System.out.print(j);
            }
            //for -> 2nd Half
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
