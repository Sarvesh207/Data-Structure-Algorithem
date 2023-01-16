package com.NewtonSchool;

public class Bubble_sort {
    public static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
//    public static void swap(int [] arr,int i,int j){
//        int temp = i;
//        i = j;
//        j = temp;
//    }
    public static void bubbleSort(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
    public static void inserationSort(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j>=0; j--){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {50,60,20,10,18,100,75};
        System.out.println("Bubble sort");
        bubbleSort(arr);
        printArray(arr);
        System.out.println("Inseration sort");
        inserationSort(arr);
        printArray(arr);
    }
}
