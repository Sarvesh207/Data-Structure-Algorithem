package Sorting;

import java.util.Scanner;

public class inserationSort {
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void InnserationSort(int [] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                //swap
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []  = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        InnserationSort(arr);
        print(arr);
    }
}
// 2 3 1 4 6