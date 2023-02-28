package hashing;

import java.util.HashMap;

public class subArraySumEqual_K {
//    public static void findSumK(int arr[], int k){
//        HashMap<Integer, Integer>map = new HashMap<>();
//        int ans = 0;
//        int sum = 0;
//        map.put(0, -1);
//        for(int i=0; i< arr.length; i++){
//            sum +=arr[i];
//            if(!map.containsKey(sum)){
//                map.put(sum, i);
//            }
//            if(map.containsKey(sum-k)){
//                ans = Math.max(ans, i-map.get(sum-k));
//            }
//        }
//        System.out.println(ans);
//    }
//    public static void findSumK(int arr[], int k){
//        HashMap<Integer, Integer>map = new HashMap<>();
//        int ans = 0;
//        int sum = 0;
//        map.put(0, 1);
//        for(int i=0; i< arr.length; i++){
//            sum +=arr[i];
//            if(map.containsKey(sum-k)){
////                ans = Math.max(ans, i-map.get(sum-k));
//                ans +=map.get(sum-k);
//            }
//            map.put(sum, map.getOrDefault(sum, 0)+1);
//        }
//        System.out.println(ans);
////        System.out.println("starting point is "+start+" ending point is "+end);
//    }
    public static  boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,0);

        int sum = 0;

        for(int i=0; i<nums.length; i++){

            sum += nums[i];

            if(!map.containsKey(sum % k)){
                map.put(sum % k, i + 1);
            }else{
                if(map.get(sum % k) < i){
                    return true;
                }
            }

        }

        return false;
    }
    public static void main(String[] args) {
        int arr [] = {23,2,4,6,7};
//        int arr [] = {1 ,2 ,3 ,7 ,5};
        int k= 12;
//        findSumK(arr, k);
        System.out.println(checkSubarraySum(arr, 12));
    }
}
