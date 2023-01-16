package com.CodewithHarry;
import java.util.Scanner;

public class CWS_07_Pratice_set_4 {
    public static void main(String[] args) {


        /*
        Problem no 1
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i>0; i--){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }

         */
         //Problem 2
        /*
        Scanner sc =  new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            sum = sum +(2*i);

        }

        System.out.println(sum);

         */
       //problem no 3
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i = 0; i<11; i++){
//            System.out.printf("%d x %d=%d \n",n,i, n*i);
//
//        }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i = 10; i>=1; i--){
//            System.out.printf("%d x %d=%d \n",n,i, n*i);
//
//        }

        //  calculate Factorial  of any number

        //using for loop
//
        // using  While loop

//        int n = 5;
//        int nfact = 1;
//        int i = 1;
//        while(i<=n){
//            nfact *= i;
//            i++;
//        }
//        System.out.println(nfact);
        //Practice Problem 9
        int n = 8;
        int sum = 0;
        for(int i = 0; i<=10; i++){
            sum += n*i ;
        }
        System.out.println(sum);
    }
}
