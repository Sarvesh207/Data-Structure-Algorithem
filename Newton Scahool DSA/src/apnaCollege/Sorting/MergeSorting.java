package apnaCollege.Sorting;

import java.util.Scanner;

public class MergeSorting {
    public static void print(int [] arr){

        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] mergeSort(int [] arr, int si, int mid, int ei){
        int merged []  = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] < arr[idx2]){

                merged[x] = arr[idx1];
                x++; idx1++;
            }else{
                merged[x] = arr[idx2];
                x++; idx2++;
            }
        }
        // remaining left elememt
        while(idx1 <= mid){
            merged[x] = arr[idx1];
            x++; idx1++;
        }

        // remaiang right elememt
        while(idx2 <= ei){
            merged[x] = arr[idx2];
            x++; idx2++;
        }
        for(int i = 0, j = si; i< merged.length; i++, j++){
            arr[j] = merged[i];
        }

        return arr;
    }
    public static int [] divide(int [] arr, int si, int ei){
        if(si >= ei){
            return arr;
        }
        int mid = (si+ei)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        mergeSort(arr, si, mid, ei);
        return arr;
    }
    public static void main(String[] args){
        int arr [] = {2,5,-3,-5,10,11,15,1};
        int n = arr.length;
        divide( arr, 0 , n-1);
        print(arr);



    }
}
















