package hashing;
import java.util.*;

public class hashMap {
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void selection(int [] arr){
        for(int i=0; i<arr.length; i++){
            int minPos = i;

            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {


    }
}
