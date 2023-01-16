package apnaCollege.arrays;

public class thirdLargestElement {
    static void print3rdLargestel(int []arr, int n){
        int max = Math.max(arr[1],arr[0]);
        int secondmax = Math.min(arr[1],arr[0]);
        int thirdmax = Integer.MIN_VALUE;
        for(int i=2; i<n; i++){
            if(arr[i]>thirdmax){
                thirdmax = arr[i];
            }
            if(arr[i]>secondmax){
                thirdmax = secondmax;
                secondmax = arr[i];
            }
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
            }
        }
        System.out.println(thirdmax);
    }
    public static void main(String[] args) {
        int arr [] = {100,350,500,250,};
        int n = arr.length;
        print3rdLargestel(arr, n);
    }
}
