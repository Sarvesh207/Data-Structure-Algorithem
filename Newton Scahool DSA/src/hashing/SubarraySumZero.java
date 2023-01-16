package hashing;

import java.util.HashMap;

public class SubarraySumZero {
    static int CalculatesizeSubarray(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(sum)){
                ans = Math.max(ans, i- map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,5,-8,3,-5};
        int ans = CalculatesizeSubarray(arr);
        System.out.println(ans);
    }
}
