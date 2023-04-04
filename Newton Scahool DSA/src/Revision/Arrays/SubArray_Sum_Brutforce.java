package Revision.Arrays;

public class SubArray_Sum_Brutforce {
    public static void calSubArraySum(int arr[]){
        int totalSubArray = 0;
        int currSum = 0;
       int max = Integer.MIN_VALUE;
       for(int i=0; i< arr.length; i++){
           int start = i;
           for(int j=i+1; j< arr.length; j++){
               int end = j;
               currSum = 0;
               for(int k = start; k<end; k++){

//                   System.out.print(arr[k]+" ");
                   currSum = currSum+ arr[k];
                    if(max < currSum){
                        max = currSum;
                    }

               }

               System.out.println();
           }
           System.out.println();
       }
        System.out.println("Maximum sum of subArray is " + max);
    }
    public static void main(String[] args) {
        int arr [] = {2, 4, 6, 8, 10};
        calSubArraySum(arr);
    }
}
