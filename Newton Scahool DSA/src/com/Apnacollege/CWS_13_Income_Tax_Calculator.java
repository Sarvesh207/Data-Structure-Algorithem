package com.Apnacollege;

import java.util.Scanner;

public class CWS_13_Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income<500000){
             tax = 0;
        }else if(income > 500000 && income < 1000000){
            tax =(int)(0.20 * income);
        }else {
            tax = (int)0.30*income;
        }


        System.out.println("your tax is "+tax);
    }
}
