package Revision.Arrays;

public class ContainerWithMostWater {

    public static int containerWithMostWater(int height[]){
        int n = height.length;
        //find left max array
        int leftMaxArray[] = new int[n];
        leftMaxArray[0] = height[0];
        for(int i=1; i<n; i++){
            leftMaxArray[i] =Math.max(leftMaxArray[i-1],height[i] );
        }

        //find right max array
        int rightMaxArray [] = new int[n];
        rightMaxArray[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMaxArray[i] = Math.max(rightMaxArray[i+1],height[i] );
        }
        //find water level
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMaxArray[i],rightMaxArray[i]);
            trappedWater += waterLevel - height[i];
        }
        // return total water
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(containerWithMostWater(height));
    }
}
