package com.pratice;
import java.util.*;

public class Arrayfunction {

    static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
       // System.out.println();
    }
    static int sumArray(int arr[]){
       int  sum = 0;
        for (int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i= 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
       printArray(arr);
        System.out.println();
        System.out.println(sumArray(arr));

    }
}
