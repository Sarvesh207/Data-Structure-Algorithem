package Revision.Arrays;

public class Pair_IN_Array {
    public static void pairInArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int current = arr[i];
            for(int j=i+1; j<n; j++){
                System.out.print("("+current+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr [] = {2, 4, 6, 8, 10};
        pairInArray(arr);
    }
}
