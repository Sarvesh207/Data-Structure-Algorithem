package com.Apnacollege;

public class CWS_17_Binary_to_Decimal {
    public static void binaryToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = decNum % 10;
            decNum = decNum + (lastDigit *(int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;

        }
        System.out.println("Decimal of "+ myNum +"="+ decNum);

    }

    public static void decTobinary(int n){
        int myNum = n;
        int pow = 0;
       int  binaryNum = 0;
        while(n>0){
            int rem = n%2;
            binaryNum = binaryNum + (rem*(int)Math.pow(10,pow)) ;
            pow++;
            n =  n/2;
        }
        System.out.println("Binary of "+myNum+" = "+binaryNum);


    }
    public static void main(String[] args) {

       // binaryToDec(111);
        decTobinary(10);
    }
}
