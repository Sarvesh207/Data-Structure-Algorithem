package com.NewtonSchool;

public class binarySearching {
    public static void main(String[] args) {
        int [] arr = {78,88,56,96,45,12};
        int tar = 78;
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if (arr[mid] == tar){
                System.out.println("found");
            }else if(arr[mid] > tar){
                high = mid - 1;
            }else{
                low = mid+1;
            }

        }

    }
}
