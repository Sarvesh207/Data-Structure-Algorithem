package Sorting;

import java.util.Scanner;

public class selectionSort {
    static void print(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    static void SelectionSort(int [] arr){
        for(int i=0; i<arr.length;i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j])
                    minPos = j;
            }
            int temp = arr[minPos];
             arr[minPos]  = arr[i];
             arr[i]  = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }
        SelectionSort(arr);
        print(arr);
    }
}
