package hashing;

import java.awt.geom.NoninvertibleTransformException;
import java.util.HashMap;
import java.util.Map;

public class CountFreq {
    static void countFreq(int arr []){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : arr){
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: hm.entrySet())
            System.out.println(e.getKey()+"="+e.getValue());
    }
    public static void main(String[] args) {
        int arr [] = {4,4,4,4,5,5,6,8,9,2,1,1,2,2,4,};
        countFreq(arr);

    }
}
