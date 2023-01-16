package Practice;

public class SelectionSort {
    static void print(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void selectionSort(int arr []){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minPos = i;
            for(int j = i+1; j<n; j++){
                if(arr[minPos] > arr[j])
                    minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr [] = {4,7,8,9,1,2,3,};
        selectionSort(arr);
        print(arr);
    }
}
