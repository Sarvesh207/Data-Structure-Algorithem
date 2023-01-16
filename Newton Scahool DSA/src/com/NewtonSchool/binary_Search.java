package com.NewtonSchool;

public class binary_Search {
    static int searchElement(int [] arr, int el){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == el){
                return mid;
            }else if(arr[mid] > el){
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = new int[]{2,6,8,10,12,18};
        int SearchEl = searchElement(arr,10);
        System.out.println(SearchEl);
    }
}
