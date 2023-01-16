package hashing;
import java.util.*;

public class BasicsofHashmap {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,-5,6,7,8,4,-5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])== false){
                map.put(arr[i],i);
            }else{
                System.out.println("found dublicate for "+arr[i]+" at index "+(i+1));
            }
        }
    }
}
