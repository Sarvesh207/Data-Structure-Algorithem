package Practice;

public class InserationSortt {
    static void print(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void inserationSort(int arr []){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,8,7,9,4,5,6};
        inserationSort(arr);
        print(arr);
    }
}
