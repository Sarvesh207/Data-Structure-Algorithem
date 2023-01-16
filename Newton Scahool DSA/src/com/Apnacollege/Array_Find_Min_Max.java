package com.Apnacollege;
import java.lang.constant.DynamicCallSiteDesc;
import java.util.*;

public class Array_Find_Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int numberArray [] = new int[size];
              // input
        for (int i =0 ;  i<size; i++){
            numberArray[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for (int i = 0; i< numberArray.length; i++){

            if (numberArray[i] < min){
                min = numberArray[i];
            }
            if (numberArray[i] > max){
                max = numberArray[i];
            }
        }
        System.out.println("Largest number in array is : " + max);
        System.out.println("Smallest number in array is : " + min);

    }
}
