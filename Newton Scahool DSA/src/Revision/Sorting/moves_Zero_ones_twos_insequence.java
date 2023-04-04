package Revision.Sorting;

public class moves_Zero_ones_twos_insequence {
    public static void printInSequence(int arr[]){
        int lo = 0;
        int mid =0;
        int hi = arr.length-1;
        for(int i=0; i<arr.length; i++){
            switch (arr[mid]){
                case 0:{
                    int temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    lo++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
//                    mid++;
//                    lo++;
                    break;
                }
            }
        }
    }
    public static void Print_array(int arr[]) {
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,0,1};
        printInSequence(arr);
        Print_array(arr);
    }
}
