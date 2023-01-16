package com.pratice;

import java.util.Scanner;

public class Array2d {

//          //Sum of Array element
//    static int arraysum(int arr1[]){
//        int sum = 0;
//        for (int i=0; i<arr1.length; i++){
//            sum += arr1[i];
//        }
//        return sum;
//    }
//         // function -> Sub Sum of Array
//         static int subArraySum(int []arr1, int start, int end ){
//        int subSum = 0;
//        for (int i = start; i<=end; i++){
//            subSum += arr1[i];
//        }
//        return subSum;
//         }
//         //function -> calculate  product of array
//    static int subArrayProduct(int [] arr, int start, int stop){
//        int subProduct = 1;
//        for (int i=start; i<=stop; i++){
//            subProduct *= arr[i] ;
//        }
//      return subProduct;
//
//    }
    //Function -> Swap the 2 indexes i & j of an array
//    static void swap(int [] arr, int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//    }
    static boolean isElementpresent(int [] arr,int El){
        for (int i=0; i<arr.length; i++){
            if (arr[i]== El){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter find element");
        int I = sc.nextInt();
//        System.out.println("Enter end of index");
//        int J = sc.nextInt();
        for (int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
//        int sumofArray =  arraysum(arr1);
//        int SubSumofArray = subArraySum(arr1,start,end);
//        int subProArray = subArrayProduct(arr1,start,end);
//
//        System.out.println("Sum of the array is : "+sumofArray);
//        System.out.println("Sub sum of array is : " + SubSumofArray);
//        System.out.println("Sub Product of array is : "+subProArray);
        System.out.println(isElementpresent(arr1,I));


    }
}
