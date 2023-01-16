package com.Apnacollege;
import java.util.*;

public class CWS_16_Patterns {

    public static void invertedStarPattern(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void starPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void pyramidPattern(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void invertedstarpyramid(int n){
        for(int i=1; i<=n; i++){
            //for-> spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //for star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void floydTriangle(int n){
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++ ){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void binaryTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }

            }
            System.out.println();
        }
    }
    public static void solidPattern(int row,int col ){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");

            }
            //star
            for(int j=1; j<=n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }

    }
    public static void hollowRhombus(int n){
       for(int i=1; i<=n; i++){
           //spaces
           for(int j=1; j<=n-i; j++){
               System.out.print("  ");
           }
           for(int j=1; j<=n; j++){
               if(i==1||j==1||i==n||j==n){
                   System.out.print("*"+" ");
               }else {
                   System.out.print("  ");
               }

           }
           System.out.println();
       }
    }

    public static void printDiamond(int n){
        //1st half
        for(int i=1; i<=n; i++){
           for (int j=1; j<=n-i; j++){
               System.out.print(" ");
           }
           int k= 2*i-1;
           for (int j=1; j<=k; j++){
               System.out.print('*');
           }
            System.out.println();
        }
        //2nd half
       for(int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                System.out.print('*');
            }
            System.out.println();
        }



    }

    public  static void printButterfly(int n){
        //1st half
        //outer loop
        for(int i=1; i<=n; i++){
            // for star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
//            //for space
            int space = 2*(n-i);
            for (int j=1; j<=space; j++){
                System.out.print("  ");
            }
            //for star
            for (int j= 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for(int i=n; i>=1; i--){
            // for star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
//            //for space
            int space = 2*(n-i);
            for (int j=1; j<=space; j++){
                System.out.print("  ");
            }
            //for star
            for (int j= 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void palindromicPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
//       System.out.println("Enter number");
//        int col = sc.nextInt();
      //  starPattern(n);
      //  invertedStarPattern(n);
      //  pyramidPattern(n);
        //invertedstarpyramid(n);
       // floydTriangle(n);
       //binaryTriangle(n);
       // solidPattern(n,m);
       // solidRhombus(n);
        //hollowRhombus(n);
       // printDiamond(n);
       // printButterfly(n);
        palindromicPattern(n);
    }
}
