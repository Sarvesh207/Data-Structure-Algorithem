package com.NewtonSchool;
import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        StringBuilder strb = new StringBuilder(s);
        for(int i=0; i<s.length()/2; i++){
            int front = i;
            int back = s.length()-1-i;
            char frontChar = strb.charAt(front);
            char backChar = strb.charAt(back);

            //strb.setCharAt();
        }


    }
}
