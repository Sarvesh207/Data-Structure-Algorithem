package backtracking;

public class Arrays {
    public static void changrArr(int  arr [], int i, int val){
        if(i== arr.length){
            print(arr);
            return;
        }
        arr[i] = val;
        changrArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }
    public static void print(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr []  = new int[5];
        changrArr(arr, 0, 1);
        System.out.println();
        print(arr);
    }
}
