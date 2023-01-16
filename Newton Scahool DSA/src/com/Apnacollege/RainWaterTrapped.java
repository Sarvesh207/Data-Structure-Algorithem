package com.Apnacollege;

public class RainWaterTrapped {
    public static int calTrappedWater(int Height [] ){
        int n = Height.length;
        //calculate leftMax element = arrat
        int leftMax [] = new int [n];
        leftMax[0] = Height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(Height[i], leftMax[i-1]);
        }
        //Calculate rightMax -. Array
        int rightMax [] = new int[n];
        rightMax[n-1] = Height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax [i] = Math.max(Height[i], rightMax[i+1]);
        }
        //calculate trappesd water
        int trappedwater = 0;
        for(int i=0; i<n; i++){
            //calculate minimum water level from(maxLeft or MaxRight
            int waterlevel = Math.min(leftMax[i], rightMax[i] );
            trappedwater += waterlevel-Height[i];
        }
       return trappedwater;

    }
    public static void main(String[] args) {
        int Height [] = {4,2,0,6,2,3,5};
        System.out.println(calTrappedWater(Height));
    }
}
