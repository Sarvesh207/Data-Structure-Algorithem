package com.Apnacollege;
import java.util.*;

public class Array_to_Print_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name [] = new String[size];
        // Input
        for (int i = 0; i<size; i++){
            name[i] = sc.next();
        }
        //output
        for (int i = 0; i< name.length; i++){
            System.out.println(name[i]);
        }
    }
}
