package com.Apnacollege;

public class CWS_05_Triangle_0_1_Pattern {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for (int i = 1; i<=n; i++){
            //Inner Loop
            for (int j = 1; j<=i; j++){
                int sum = i+j;
                if (sum % 2 == 0){ //For even
                    System.out.print("1"+" ");
            }else {           //for odd
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
       }
   }
}
