package Practice;

import java.util.HashMap;

public class LogestSubarrayZeroSum {

    public static void main(String[] args) {
        int arr [] = {1,2,3,5,-8,3,-5};

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];

            if(map.containsKey(sum))
                 ans = Math.max(ans, i-map.get(sum));
            else
                map.put(sum,i);
        }
        System.out.println(ans);
    }
}
