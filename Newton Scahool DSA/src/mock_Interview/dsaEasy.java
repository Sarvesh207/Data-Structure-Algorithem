package mock_Interview;

import java.util.HashMap;
import java.util.Map;

public class dsaEasy {
    static void countfrq(int arr []){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : arr){
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer>e: hm.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
    public static void main(String[] args) {
        int arr [] = {1 ,1, 1, 1 ,2 ,2 ,2, 3 ,3 ,3 ,4 ,4} ;
        countfrq(arr);

        
        int n = arr.length;

    }
}
