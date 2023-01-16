package apnaCollege.arrays;

public class PrintSubArrrays {
    static void printSubArray(int [] arr){
        int count = 0;
        int n = arr.length;
        for(int i = 0 ; i<n; i++){
            int start = i;
            for(int j =i; j<n; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr [] = {2,4,5,6,7,8};
        printSubArray(arr);

    }
}
