package com.pratice;
import java.util.*;

public class Practice_07 {
    public static void solution(int [] merged){
        int n = merged.length;

        if(n%2 == 0){
            int z = n/2;
            int x =  merged[z];
            int y = merged[z-1];
            int ans = (x+y)/2;
            System.out.println(ans);
        }
        else{
            int z = Math.round(n / 2);
            System.out.println(z);
        }

    }
    public static void mergedarray(int []A,int n,int[] B, int m){
        int merged [] = new int [n+m];
        int ptr1 = 0;
        int ptr2 = 0;
        int index = 0;

        while(ptr1 < n && ptr2 < m){
            if(A[ptr1] < B[ptr2]){
                merged [index++] = A[ptr1++];
            }else {
                merged [index++] = B[ptr2++];
            }
        }

        while( ptr1 < n){
            merged [index++] = A[ptr1++];
        }

        while(ptr2 < m){
            merged [index++] = B[ptr2++];
        }

        for(int i=0, j=ptr1; i<merged.length; i++){

        }

      //  solution(merged);

    }
    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of 1st array");
//        int n = sc.nextInt();
//        System.out.println("Enter size of 2st array");
//        int m = sc.nextInt();
//        int A [] = new int[n];
//        int B [] = new int [m];
        int A[] = {1,3,11,5,9};
        int B [] = {2,8,3,1,4};
        int n = A.length;
        int m = B.length;

        //1st array
/*        for(int i=0; i<n; i++){

            A[i] = sc.nextInt();

        }
        //2nd array
        System.out.println("1st array input");
        for(int i=0; i<n; i++){

            B[i] = sc.nextInt();

        }

 */

        mergedarray(A, n, B, m);

    }
}
