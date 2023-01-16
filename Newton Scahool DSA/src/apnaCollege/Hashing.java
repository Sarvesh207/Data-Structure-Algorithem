package apnaCollege;

import java.util.HashMap;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // country(Key), population(value0
        HashMap<String, Integer> hm = new HashMap<>();
        //Inseration
        hm.put("India", 120);
        hm.put("USA", 50);
        hm.put("China", 110);
        hm.put("France", 30);
        hm.put("China", 125);

        System.out.println(hm);

        //search
        if(hm.containsKey("Indonesia")){
            System.out.println("key is present in map");
        }else{
            System.out.println("key is not present");
        }

        System.out.println(hm.get("China")); //key exist
        System.out.println(hm.get("Indonesia")); // key does'nt exist
        int arr [] = {1,2,3,4,5,5};
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int val :arr ){
            System.out.print(val+" ");
        }
        System.out.println();

    }
}
