package com.pratice;
import java.util.*;

public class Print_Half_Pyramid {

        static void printArray(int [] A){
            for(int i=0; i<A.length; i++){
                System.out.print(A[i]+" ");

            }
        }

        public static void swap(int [] A,int a, int b){
            int temp = A[a];
            A[a] = A[b];
            A[b] = temp;
        }


        public static void inserationSort(int [] A){
            for(int i=0; i<A.length-1; i++){
                for(int j = i+1; j>0; j--){
                    if(A[j] < A[j-1]){
                        swap(A,j,j-1);
                    }else{
                        break;
                    }
                }
            }
        }
        public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for(int i=1; i<=tc; i++){
                int N = sc.nextInt();
                int A [] = new int[N];
                for(int j=0; j<N; j++){
                    A[i]= sc.nextInt();
                }
                inserationSort(A);
                printArray(A);
            }





        }
    }


