package com.Apnacollege;
import java.util.*;

public class Arrays_input_output {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        //for input
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int x = sc.nextInt();
        //for output
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == x){
                System.out.println("x found at imdex at "+i);
            }else {
                System.out.println("Invalid number");
            }
        }


    }
}
