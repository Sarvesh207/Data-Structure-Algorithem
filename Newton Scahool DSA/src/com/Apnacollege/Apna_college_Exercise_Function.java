package com.Apnacollege;
import java.util.*;

public class Apna_college_Exercise_Function {
    // To check prime number
//    public static int printPrimeNumber(int n){
//        if (n % 2==1){
//            System.out.println("its Prime number");
//        }else System.out.println("Invalid number");
//        return n;
//    }
    //Check even number
//    public static int checkEvenNumber(int n){
//        if (n % 2 == 0){
//            System.out.println("It is even Number");
//        }else System.out.println("It is not even Number");
//        return n;
//    }
    // Print table of given number
    public static int printTable(int n){
        for (int i = 1; i<=10; i++){
            System.out.println(n*i);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       // printPrimeNumber(a);
       // checkEvenNumber(a);
        printTable(a);

    }
}
