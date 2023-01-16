package Arrays2d;
import java.util.*;
public class BoundryTravelsal {

    public static void printLefttoRight(int arr[][],int row, int col1, int col2){
        for(int i=col1; i<= col2; i++){
            System.out.print(arr[row][i]+" ");
        }
    }
    public static void printRighttoLeft(int arr[][],int row, int col1, int col2){
        for(int i=col2; i>=col1; i--){
            System.out.print(arr[row][i]+" ");
        }
    }
    public static void printToptoDown(int arr[][],int col, int row1, int row2){
        for(int i=row1; i>=row2; i++){
            System.out.print(arr[i][col]+" ");
        }
    }
    public static void printDowntoTop(int arr[][],int col, int row1, int row2){
        for(int i=row2; i>=row1; i--){
            System.out.print(arr[i][col]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
           int n = sc.nextInt();
        System.out.println("enter no. of colums");
           int m = sc.nextInt();
        System.out.println("Enter space separate integer");
           int arr [][] = new int[n][m];
           for(int i=0; i<n; i++){
               for(int j=0; j<m; j++){
                   arr [i][j]  = sc.nextInt();
               }
           }

         printLefttoRight(arr,0,0,m-1);
           printToptoDown(arr, m-1, 1,n-1);
           printRighttoLeft(arr, n-1, 0,m-2);
           printDowntoTop(arr, 0, 1,n-2);
           System.out.println();

    }
}
