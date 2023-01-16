package com.Apnacollege;
import java.sql.SQLOutput;
import java.util.*;

public class Mini_Project_RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int myNumber = (int)(Math.random()*100);
    int userNumber = 0;

        do {
            System.out.println("Guess a number");
             userNumber = sc.nextInt();
            if (myNumber ==  userNumber){
                System.out.println("WOOHOO...... YOUR ARE CORRECT");
                break;
            }else if(myNumber > userNumber){
                System.out.println("YOUR NUMBER IS TOO SMALL");
            }else {
                System.out.println("NUMBER IS TOO LARGE");
            }

        }while (userNumber >= 0);

    }
}
