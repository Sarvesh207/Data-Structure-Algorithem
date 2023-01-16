package com.Apnacollege;

public class CWS_10_Diamond_Pattern_5star {
    public static void main(String[] args) {
        int n = 5;
      //  FOR -> 1st Half
        for (int i= 1; i<=n; i++){
            //For -> Spaces
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for-> STAR
                for (int j= 1; j<=i; j++){
                    System.out.print("*"+" ");
                }
            System.out.println();
        }
        }
   }

