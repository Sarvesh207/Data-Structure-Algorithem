package apnaCollege.arrays;

import java.util.HashSet;

public class CountDstintEle {
    public static int distintEl(int arr []){
        int n = arr.length;
        int res = 0;
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int j=0; j<i; j++){
                if (arr[i] == arr[j]){
                    flag = true;
                    break;
               }
           }
            if(flag == false){
                res++;
            }
        }
        return res;
    }

    //using hashing
    public static int countDistintHashing(int arr []){
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int [] arr = {10,20,10,20,30,10,40};
        int ans = countDistintHashing(arr);

        System.out.println(ans);

    }
}
