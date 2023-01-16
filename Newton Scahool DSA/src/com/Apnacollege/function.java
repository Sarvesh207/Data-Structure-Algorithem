package com.Apnacollege;
import java.util.*;

public class function {
    //sum
//    public static  int calculateSum(int a,int b){
//        return a + b;
//    }
    //multiplication
//    public static int calProduct(int a,int b){
//        int product = a * b;
//        return product;
//    }
    //Factorial
    public static int calFact(int n){
        if (n < 0){
            System.out.println("Invalid");
        }
        int fact = 1;
        for (int i = n; i>=1; i-- ){
            fact *= i;
        }
        System.out.println(fact);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      //  int b = sc.nextInt();
      //  int sum = calculateSum(a,b);
      //  System.out.println(calculateSum(a,b));
//
        int factorial = calFact(a);
       // System.out.println(factorial);




    }
}
