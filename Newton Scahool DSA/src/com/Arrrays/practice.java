package com.Arrrays;
import java.util.*;
import java.io.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        //taking input
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //print output
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
