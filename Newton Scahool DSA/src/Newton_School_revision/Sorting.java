package Newton_School_revision;

public class Sorting {
    static void print(int [] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void inserationSort(int arr [] , int n ){
        for(int i=0; i<n-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void selectionSort(int arr [], int n){
        for(int i=0; i<n-1; i++){
            int minPos = i;
            for(int j=i+1; j<n; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }
    static void bubbleSort(int arr [], int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr [] = {2,5,9,4,3};
        int n = arr.length;
       // bubbleSort(arr, n);
        //selectionSort(arr, n );
        inserationSort(arr, n);
        print(arr);

    }
}
