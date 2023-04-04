package Revision.Arrays;

public class ReverseArray {
    public static void reverseArray(int arr []){

        int first = 0;
        int last = arr.length-1;

        while(first < last){
            //Swapping first and last
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        print(arr);
    }
    public static void print(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {2, 4, 6, 8, 10, 12, 14};
//        reverseArray(arr);
         print(arr);

    }
}
