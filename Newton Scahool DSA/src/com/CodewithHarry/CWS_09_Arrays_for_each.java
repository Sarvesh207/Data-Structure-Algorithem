package com.CodewithHarry;

public class CWS_09_Arrays_for_each {
    public static void main(String[] args) {
       int marks[]={98,22,55,26,36,41,85};
       // float marks[]={98,22.5f,55.6f,26.8f,36.7f,41.8f,85.9f};
        System.out.print("Length of arrays : ");
        System.out.println(marks.length);
        //Displaying the array
        System.out.println("Printing using naive method");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Dispalying arrays (Using for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //Displayimg the arrays using for loop in reverse order
        System.out.println("Printing using for loop in reverse order");
        for (int i= marks.length-1; i>=0;i--)
            System.out.println(marks[i]);

    /*    //Displayimg the arrays using for each loop
        System.out.println("Printing using for each loop");
        for(int element:marks){
            System.out.println(marks[element]);
        }

     */
    }

}
