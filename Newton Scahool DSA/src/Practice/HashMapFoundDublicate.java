package Practice;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapFoundDublicate {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,-5,6,7,8,4,-4,-5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], arr[i]);
            }
            else{
                System.out.println("Found dublicate for  "+ arr[i]+" at index "+(i+1));
            }
        }
    }
}
