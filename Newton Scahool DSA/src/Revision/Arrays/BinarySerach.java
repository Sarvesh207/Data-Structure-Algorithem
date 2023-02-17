package Revision.Arrays;

public class BinarySerach {

    public static int binarySerch(int arr[], int key){
        int n = arr.length;

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr [] = {2, 4, 6, 8, 10, 12, 14};
        int key = 14;
        System.out.println(binarySerch(arr, key));
    }

}
