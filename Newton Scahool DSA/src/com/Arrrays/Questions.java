package com.Arrrays;

import java.awt.font.FontRenderContext;
import java.util.Arrays;

public class Questions {

    public static int sum(int arr[]){

        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];  //sum = sum + arr[i];
        }
        return sum;
    }

    public  static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i ++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
            if (min>arr[i])
                min = arr[i];
        }
         return min;
    }

    public  static int span(int arr[]){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int  i = 0; i < arr.length; i++){
            if (arr[i]>max) max = arr[i];
            if (arr[i]<min) min = arr[i];
        }
        return max - min;


    }
    public static boolean isElementRepeated(int arr[],int n){

        int count = 0;
        for(int i= 0; i < arr.length; i++){
            if (arr[i]==n) count++;
            if (count>1) return true;

        }
        return false;
    }

    public static int sumOfOddIndex(int arr[]){
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            if(i%2 ==1) {
                sum += arr[i];
            }
        }
        return sum;

    }
    // we can write in another this way
    public static int sumOfodd(int arr[]){
        int sum = 0;
        for (int i=1; i<arr.length; i+=2){
            sum += arr[i];
        }
        return sum;

    }

    //sum of element even index
    public static int sumOfEvenIndex(int arr[]){

        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            if (i%2==0)
                sum += arr[i];
        }
        return sum;
    }

    // Another way we can solve or calculate the sum of even index element

    public static int sumofEVEN(int arr[]){
        int sum = 0;
        for (int i = 0; i<arr.length; i += 2){
            sum += arr[i];
        }
        return sum;
    }

    //reverse the array

    public static void reverse(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left < right){

            // Swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void display(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Inverse of arrays

    public static int[] inverse(int arr[]) {
      int res[] = new int[arr.length];

      for(int i = 0; i<arr.length; i++)
      {
       res[arr[i]]  = i;
      }
return res;
    }
    public static void targetSumPair(int arr[],int target){
        //find all pair
        for(int sp = 0 ; sp < arr.length - 1; sp++){

            //move end point
            for(int ep =sp + 1; ep < arr.length; ep++ ){

              if ( arr[sp] + arr[ep] ==target)
                  System.out.println(arr[sp] + "," + arr[ep] );
            }
        }

    }

    public static void main(String[] args) {
      //  int arr[] = {1,2,3,4,5,4};
       // System.out.println(sum(arr));
       // System.out.println(max(arr));
       // System.out.println(span(arr));
       // System.out.println(sumOfOddIndex(arr));
       //   System.out.println(sumOfodd(arr));
       // System.out.println(sumOfEvenIndex(arr));
        //.out.println(sumofEVEN(arr));
   //     System.out.println(min(arr));
//        display(arr);
//        reverse(arr);
//        display(arr);
        int arr2[] = {4,1,0,2,3};
        int inv[] =   inverse(arr2);
//        display(arr2);
//        display(inv);
        targetSumPair(arr2 , 4);




    }
}
