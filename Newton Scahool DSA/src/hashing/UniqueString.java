package hashing;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueString {
    /**
     * wap to find number of unique String
     * ex-> 5
     * a ab ab ab a
     * */
    static int uniqueString(String [] arr){
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
           hs.add(arr[i]) ;
        }
        System.out.println(hs);
     return hs.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.next();
        }
        int ans = uniqueString(arr);
        System.out.println(ans);
    }
}
