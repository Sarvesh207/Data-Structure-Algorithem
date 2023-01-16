package apnaCollege.arrays;

public class maxSubArraySum {
    static void SubArraySum(int [] number){
        int maxSum = Integer.MIN_VALUE;
        int cuSum = 0;
        for(int i=0; i<number.length; i++){
          int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                cuSum = 0;
                for(int k=start; k<=end; k++){
                     cuSum += number[k];

                }
                System.out.println(cuSum);
                if(maxSum < cuSum){
                    maxSum = cuSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }
    public static void main(String[] args) {
        int number [] = { 2,4,6,8,10};
        SubArraySum(number);
    }
}
