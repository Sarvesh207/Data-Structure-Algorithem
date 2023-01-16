package com.pratice;
import java.util.Scanner;

public class Praticeset_qus_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a ");
        float a = sc.nextInt();
        System.out.println("Enter value of v ");
        float v = sc.nextInt();
        System.out.println("Enter value of u ");
        float u = sc.nextInt();
        System.out.println("Enter value of s ");
        float s = sc.nextInt();
        System.out.println(v*v-u*u/2*a*s);
    }
}
