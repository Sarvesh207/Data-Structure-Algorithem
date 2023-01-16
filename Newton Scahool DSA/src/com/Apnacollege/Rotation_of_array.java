package com.Apnacollege;

import java.util.Arrays;

public class Rotation_of_array {
    //Appproch 1st brutforce
    public static void RotateArray(int [] arr,int k){
        for(int j=1; j<=k; j++){
          int size = arr.length;
          int last = arr[size-1];
          for(int i=size-1; i>0; i--){
            arr[i] = arr[i-1];
         }
          arr[0] = last;
        }
        System.out.print(Arrays.toString(arr));

    }


    //Optimize way to rotate array approch ->2
    public static void RotationofArray(int [] arr, int k){
        k %=arr.length;
      reverseArray(arr, 0, arr.length-1 );
      reverseArray(arr, 0, k-1);
      reverseArray(arr,k,arr.length-1);
    }
    public static void reverseArray(int [] arr, int first, int last){

        while(first<last){
            int temp =  arr[first];
            arr[first] = arr[last];
            arr[last] =  temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int k = 1;
      //  RotateArray(arr,k);
       // reverseArray(arr,0,arr.length-1);
        RotationofArray(arr,k);
        System.out.print(Arrays.toString(arr));
    }
}
