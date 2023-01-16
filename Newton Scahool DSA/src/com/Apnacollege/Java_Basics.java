package com.Apnacollege;
import java.util.*;

public class Java_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
 //            Question no 1
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
//        int avg = (A+B+C)/3;
//        System.out.println(avg);

        // question 2
       /*   Question no 3
        int side = sc.nextInt();
        System.out.println(side*side);

        */
        /*
        System.out.println("Enter cost of Pencil");

         float costPencil = sc.nextFloat();
        System.out.println("Enter cost of Pen");
         float costPen = sc.nextFloat();
        System.out.println("Enter cost of Eraser");

        float costEraser = sc.nextFloat();
        float totalcost = costPencil+costPen+costEraser;
        System.out.println("Total cost of the three items is : "+ totalcost);

         */
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*b)+(i%c)-(d*s);
        System.out.println(result);

    }
}
