package com.CodewithHarry;

public class CWS_06_Brake_and_Continue {
    public static void main(String[] args) {

    /*    for ( int i= 0; i<10; i++){
            if ( i==2){
                System.out.println("Ending the loop");
                continue;

            }
            System.out.println(i);
            System.out.println("JAVA is great");
        }

     */
        int i = 1;
        do{

            if (i==5){
                i++;
                System.out.println("Ending loop");
                continue;
            }
            System.out.println(i);
            System.out.println("JAVA is great");

        }while (i<15);
        System.out.println("Loops ends here");






  /*    For loop
    for (int i = 1 ; i<=5; i++){
            System.out.println(i);
            System.out.println("JAVA is great");
            if (i==3)
                break;

   */

      /*  While loop

       int i =0;
        while(i<10){
            System.out.println(i);
            System.out.println("java is great");
            if (i==5)
                break;
            i++;
        }

       */
/*     For Do While Loop
     int i = 1 ;
        do{
            System.out.println(i);
            System.out.println("JAVA is great");
            if (i==5){
                System.out.println("Ending the loop");
                break;
            }
            i++;
            } while(i<20);
        System.out.println("Loops end here");

 */




    }
}
