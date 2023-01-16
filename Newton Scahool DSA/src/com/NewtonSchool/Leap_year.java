package com.NewtonSchool;
import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
