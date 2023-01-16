package com.Apnacollege;

import java.util.Scanner;

public class CWS_012_ifElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int age = 16;
       if(age>=18){
           System.out.println("Adult: Drive, vote");
       }
       if(age > 13 && age < 18){
           System.out.println("Teenager");
       }

       else{
           System.out.println("Not Adult");
       }



    }
}
