package LeetCode;
import java.util.*;

public class TwoSum {
    public static  int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int ptr1 = 0;
        int ptr2 = nums.length - 1;
        int result[] = new int[2];

        while (ptr1 < ptr2) {
            int sum = nums[ptr1] + nums[ptr2];
            if (sum == target) {
                result[0] = ptr1;
                result[1] = ptr2;
                break;
            } else if (sum < target) {

                ptr1++;

            } else {

                ptr2--;

            }

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]  = {3,2,4};
        int target = 6;
        int [] result = twoSum(arr, target );
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
