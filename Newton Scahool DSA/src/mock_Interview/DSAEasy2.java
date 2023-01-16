package mock_Interview;
/**Problem 1: Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

 Example:

 Input : arr[] = {0, 2, 1, 2, 0}

 Output : 0 0 1 2 2

 Explanation: 0s 1s and 2s are segregated into ascending order.
 * */

public class DSAEasy2 {
    static  void print(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void bubbleSort(int arr []){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){

                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
      int arr [] = {0,2,1,2,0};
      bubbleSort(arr);
      print(arr);
    }
}
