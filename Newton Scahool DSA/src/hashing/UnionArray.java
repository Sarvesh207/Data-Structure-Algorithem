package hashing;

import java.util.HashSet;

public class UnionArray {
    static int unionArray(int [] a, int b []){
        HashSet<Integer> hs = new HashSet<>();
        for(int x : a){
            hs.add(x);
        }
        for(int x : b){
            hs.add(x);
        }
        System.out.println(hs);
        return hs.size();
    }
    public static void main(String[] args) {
        int a [] = {5,10,15,5};
        int b [] = {10,15,4};
        int ans = unionArray(a, b);
        System.out.println(ans);
    }
}
