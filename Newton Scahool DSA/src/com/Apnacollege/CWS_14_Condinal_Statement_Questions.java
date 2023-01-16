package com.Apnacollege;
import java.util.*;

public class CWS_14_Condinal_Statement_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 == 0)) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }




       /*   Question 3
       int number = sc.nextInt();
        switch(number){
            case 1 : System.out.println("Monday");
            break;
            case 2 :
                System.out.println("Thuesday");
                break;
            case 3 :
                System.out.println("Wedenesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Input");

        */


      /* Question 2
      doubletemp = 103.5;
       String staus = (temp>100)?"You have fever":"You don't have fever";
        System.out.println(staus);
       */
      /*   Question 1
      System.out.println("Enter number");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("Number is positive");
        }else
            System.out.println("Number is negative");

       */




}
}