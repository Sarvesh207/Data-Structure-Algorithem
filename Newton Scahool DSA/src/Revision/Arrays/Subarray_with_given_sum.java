package Revision.Arrays;

import java.util.Scanner;

public class Subarray_with_given_sum {
    public static void subArrayGivenSum(int arr[], int k){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i+1; j<arr.length; j++){
                int end = j;
                sum = 0;
                for(int z = start; z<=end; z++){
                    sum += arr[z];
                }
                if(sum == k){
                    System.out.println("starting index :"+start+"ending index : "+end);
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int arr [] = {1,2,3,7,5};
        int k = sc.nextInt();
//        int arr[] = new int[n];
        subArrayGivenSum(arr, 12);
    }
}
