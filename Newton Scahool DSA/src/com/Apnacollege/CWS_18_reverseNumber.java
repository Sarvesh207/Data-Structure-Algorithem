package com.Apnacollege;

public class CWS_18_reverseNumber {
    public static void printreverse(int n){
        int mynum = n;
        while(n>0){
            int  lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;
        }
    }

    // reverse the given number
    public static void reverseNumber(int n){
        int myNum = n;
        int reverse = 0;
        while(n>0){
            int lastDigit =  n % 10;
            reverse = (reverse*10) + lastDigit;
            n = n / 10;

        }
        System.out.println("The reverse of "+myNum+" is "+reverse);

    }

    public static void main(String[] args) {
        int num = 56987;
        reverseNumber(num);
    }
}
