package com.pratice;
import java.util.Scanner;

public class pratice_set_chapter4 {
    public static void main(String[] args) {
        /* question 1
//        int a = 10;
//        if (a=11) {
//
//        }

         */
        // Question 2
        /*
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Math");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage"+avg);
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("You have been promoted");
        }else{
            System.out.println("Sorry you have not been promoted! Please try again");
        }

         */
        //Question No 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
          tax = tax+0;
        }else if(income<2.5f && income<=5.0f){
            tax = tax + 0.05f * (income-2.5f);

        }else if(income<5f && income<=10f){
            tax = tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.2f * (income-5f);

        }else if(income<10.0f){
            tax = tax + 0.05f * (5.0f-2.5f);
            tax = tax + 0.2f * (10.f-5f);
            tax = tax + 0.3f * (income-10.f);

        }
        System.out.println("The total tax paid by the employee is: "+tax);






    }
}
