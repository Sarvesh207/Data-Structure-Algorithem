package Revision.Arrays;

public class SubArraySumby_PrefixSum {

        public static void calSubArraySum(int arr[]){

            int currSum = 0;
            int max = Integer.MIN_VALUE;
            int preFixSum [] = new int[arr.length] ;
            //cal prefix sum of array
            preFixSum[0] = arr[0];
            for(int i=1; i< arr.length; i++){
                preFixSum[i]= preFixSum[i-1] + arr[i];
            }

            for(int i=0; i< arr.length; i++){
                int start = i;
                for(int j=i+1; j< arr.length; j++){
                    int end = j;
                    currSum = start == 0 ? preFixSum[end] : preFixSum[end] -preFixSum[start - 1];
                    if(max < currSum){
                        max = currSum;
                    }
                }
//                System.out.println();
            }
            System.out.println("Maximum sum of subArray is " + max);
        }
        public static void main(String[] args) {
            int arr [] = {2, 4, 6, 8, 10};
            calSubArraySum(arr);
        }
}
