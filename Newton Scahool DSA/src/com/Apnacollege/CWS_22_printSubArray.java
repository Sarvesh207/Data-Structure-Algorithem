package com.Apnacollege;

public class CWS_22_printSubArray {
    public static void printSubArrays(int[] n){
        for(int i=0; i<n.length; i++){
            for(int j=i; j<n.length; j++){
               for(int k = i; k<=j; k++){
                   System.out.print(n[k]+" ");
              }
                //System.out.println();
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int n [] = {2,4,6,8,10};
        printSubArrays(n);

    }
}
