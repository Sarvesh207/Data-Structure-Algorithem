package apnaCollege.arrays;

public class SumoOfOddLengthSubArray {
    static  void genrateOddlengthSubArray(int arr [], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j+=2){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr [] = {3,2,4};
        int n = arr.length;
        genrateOddlengthSubArray(arr, n);
    }
}
