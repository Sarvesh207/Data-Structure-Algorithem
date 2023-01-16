package Practice_LeetCode;

import java.util.HashMap;

public class TwoSum {
//    public static void CaltwoSum(int arr [],int target){
//        int n = arr.length;
//        int result [] = new int[2];
//        for(int i=0; i<n-1; i++){
//            for(int j=i+1; j<n-1; j++){
//                if(arr[i]+arr[j] == target){
//                    result[0] = arr[i];
//                    result[1] = arr[j];
//                }
//            }
//        }
//        for(int i=0; i< result.length; i++){
//            System.out.print(result[i]+" ");
//        }
//
//    }

    //Optmize Aproch
    public  static int [] calSUM(int arr [], int target){
        int result [] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(target-arr[i])){
                result[0] = map.get(target-arr[i]);
                result[1] = i;
            }
            map.put(arr[i],i);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums = {2,6,5,8,11};
        //CaltwoSum(nums, 14);
        int result  [] = calSUM(nums, 14);
            for(int i=0; i< result.length; i++){
              System.out.print(result[i]+" ");
            }

    }
}
