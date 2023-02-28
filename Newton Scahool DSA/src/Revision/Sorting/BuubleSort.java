package Revision.Sorting;

public class BuubleSort {
    public static void Buuble_sort(int arr[]){
        int count = 0;
        Boolean flag = false;
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
                System.out.println("loop is running "+ count++);
            }
            if(flag == false){
                System.out.println("Array is sored");
                break;
            }
        }
        Print_array(arr);
    }
    public static void Print_array(int arr[]) {
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
//        int arr [] = {7,8,3,1,2};
        int arr [] = {1, 2, 3, 4, 5};
        Buuble_sort(arr);

    }
}
