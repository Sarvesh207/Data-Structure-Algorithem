package recursion;

import javax.management.MBeanAttributeInfo;

public class LastOccurance {
    public static int lastOccurance(int arr [], int key, int i){
        if( i == arr.length)
            return -1;
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr [] = {8,9,4,5,2,3,6,7,5,2,9,3};
        int key = 3;
        System.out.println(lastOccurance(arr, key, 0));

    }
}
