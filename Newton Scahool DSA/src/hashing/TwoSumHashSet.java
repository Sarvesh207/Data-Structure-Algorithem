package hashing;

import java.util.HashSet;

public class TwoSumHashSet {
    static boolean targetSumHashset(int [] arr, int target){
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            int b = target-arr[i];
            if(hs.contains(b))
                return true;
            hs.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr []  = {5,12,21,1,6};
        int targetSum = 26;
        System.out.println(targetSumHashset(arr, 26));


    }
}
