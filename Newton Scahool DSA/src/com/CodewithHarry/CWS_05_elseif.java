package com.CodewithHarry;

import java.util.Scanner;

public class CWS_05_elseif {
    public static void main(String[] args) {


      String  var = "Devesh";
      switch (var){
          case "Devesh" : System.out.println("You are going to become adult");
         break;
         case "Kedar" : System.out.println("You are going to get a job");
          break;
          case "Gauresh" : System.out.println("You are going to get retired");
          break;
          default :
              System.out.println("Enjoy your life");
      }
/*
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
      int age = sc.nextInt();
      if (age>56){
          System.out.println("You are experiened");
      }else if(age>46){
          System.out.println("You are semi-experienced");
      }else if(age>36){
          System.out.println("You are semi-semi experienced");
      }else{ System.out.println("You are not experienced");
      }

 */
      //Switch

    }
}
