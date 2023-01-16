package Practice;

public class BubbleSort {
    static void print(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void bubbleSort(int arr []){
        int n = arr.length;
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;

                }
                if(flag == false){
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        bubbleSort(arr);
        print(arr);

    }
}
