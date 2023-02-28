package hashing;

import java.util.HashMap;

public class subArraySum_Zero {
    public static void findSum(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                ans  = Math.max(ans,i- map.get(sum));
            }else {
                map.put(sum, i);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
//        int arr [] = {1, 2, 3, 5, -8, 3, -5};
        int arr [] = {15, -2, 2, -8, 1, 7, 10, 23};
        findSum(arr);
    }
}
