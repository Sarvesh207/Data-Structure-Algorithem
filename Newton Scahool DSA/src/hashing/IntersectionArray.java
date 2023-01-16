package hashing;

import java.util.HashSet;

public class IntersectionArray {
    public  static int intersectionArrray(int [] a, int [] b){
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for(int x : a)
        hs.add(x);

        for(int x : b){
            if(hs.contains(x)){
                count++;
                hs.remove(x);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] a = {5,10,15,5,10};
        int b [] = {15,10,4};
        System.out.println(intersectionArrray(a, b));
    }
}
