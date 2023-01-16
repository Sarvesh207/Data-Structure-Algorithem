package com.NewtonSchool;

import java.util.Arrays;
import java.util.Scanner;

public class MergedSortTwoArray {
   public static int [] merged(int []A, int [] B){
    int n = A.length;
    int m = B.length;

    int Merge [] = new int[n+m];
    int ptr1 = 0;
    int ptr2 = 0;
    int index = 0;

    while(ptr1<n && ptr2<m){

        if(A[ptr1] < B[ptr2]){

            Merge[index++] = A[ptr1];
            ptr1++;

        }
        else{
            Merge[index++]= B[ptr2];
            ptr2++;

        }
    }
    while(ptr1 < n){
        Merge[index++] = A[ptr1];
        ptr1++;
    }
    while(ptr2 < m){

        Merge[index++]= B[ptr2];
        ptr2++;
    }


    return  Merge;
    }
    public static int calMeadien(int [] arr){
        int n = arr.length;
        if(n%2 == 0){
            int z  = n/2;
            int x = arr[z];
            int e = arr[z-1];
            int ans = (x+e)/2;
            return ans;
        }else{
       int z = Math.round(n/2);
       return arr[z];
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Size of 1st array");
       int n = sc.nextInt();
        System.out.println("Size of 2nd array");
       int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        //1st array
        System.out.println("Enter 1st array inputs");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter 2nd array inputs");
        for(int j=0; j<m; j++){
            arr2[j] = sc.nextInt();
        }

        int arr [] = merged(arr1,arr2);
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int Median = calMeadien(arr);
        System.out.print("The meadian of array is  :"+Median);



    }
}
