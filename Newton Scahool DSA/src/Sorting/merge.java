package Sorting;
import java.sql.SQLOutput;
import java.util.*;

public class merge {
    public static int [] merge(int [] arr, int si,int mid, int ei){
        int merged[] = new int [ei-si+1];

        int ptr1 = si;
        int ptr2 = mid+1;
        int x = 0;
        while(ptr1 <= mid && ptr2 <= ei){
            if(arr[ptr1] < arr[ptr2]){
                merged[x++] = arr[ptr1++];
            }else{
                merged[x++] = arr[ptr2++];

            }
        }

        while(ptr1 <= mid){

            merged[x++] = arr[ptr1++];

        }

        while(ptr2 <= ei){

            merged[x++] = arr[ptr2++];

        }

        for(int i=0, j=si; i<merged.length; i++, j++){

            arr[j] = merged[i];

        }


        return arr;
    }
    public static int [] divide(int [] arr, int si, int ei){
        if(si>=ei){

            return arr;

        }
        int mid = (si+ei)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        merge(arr,si,mid,ei);
        return arr;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];

        //input
        for(int i=0; i<n; i++){

            arr[i] = sc.nextInt();

        }


        divide(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //System.out.println(count);
    }
}
