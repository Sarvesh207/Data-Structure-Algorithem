package Practice;

public class MergedSort {
    static void print(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void merge(int arr [], int si, int mid, int ei){
        int newArr [] = new int[ei-si+1];
        int ptr1 = si;
        int ptr2 = mid+1;
        int x = 0;
        while(ptr1 <= mid && ptr2 <= ei){

            if(arr[ptr1] < arr[ptr2]){
                newArr[x++] = arr[ptr1++];
            }else{
                newArr[x++] = arr[ptr2++];
            }
        }
        while(ptr1 <= mid){
            newArr[x++] = arr[ptr1++];
        }
        while (ptr2 <= ei){
            newArr[x++] = arr[ptr2++];
        }

        for(int i=0, j= si; i< newArr.length; i++, j++){
            arr[j] = newArr[i];
        }
    }
    static void divide(int arr [], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        merge(arr, si,mid, ei);
    }
    public static void main(String[] args) {
        int arr [] = {11,14,9,15,20,19,17,10};
        divide(arr, 0, arr.length-1);
        print(arr);
    }
}
