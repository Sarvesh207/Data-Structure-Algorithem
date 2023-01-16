package com.pratice;

public class Binary_Search {
    static int binarySearch(int [] arr, int el){
        int low =0;
        int high = arr.length;
        while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid] == el){
               return mid;
           }else if (arr[mid] > el){
               high = mid-1;

           }else {
               low = mid+1;
           }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {5,15,20,40,45,65};
       int search =  binarySearch(arr,45);
        System.out.println(search);

    }
}
