package hashing;

import java.util.*;

public class majorityElement {
//    public static void PrintMajorityEle(int arr[]){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i=0; i< arr.length; i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i], map.get(arr[i])+1);
//            }else {
//                map.put(arr[i], 1);
//            }
//        }
//        Set<Integer> keys =map.keySet();
//        for (Integer k: keys) {
//            if(map.get(k)>arr.length/3)
//            System.out.print(k);
//        }
//    }
    public static void PrintMajorityEle(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< arr.length; i++){
           map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
//        Set<Integer> keys =map.keySet();
        for (Integer k: map.keySet()) {
            if(map.get(k)>arr.length/3)
            System.out.print(k);
        }
    }
    public static void main(String[] args) {
        int arr [] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        PrintMajorityEle(arr);
    }
}
