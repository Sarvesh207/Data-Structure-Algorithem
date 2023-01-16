package recursion;

public class Firstoccurance {
    public static int firstoccurance(int arr [], int key,int i){
        if(i == arr.length)
            return -1;
        if(arr[i] == key){
            return i;
        }
        return firstoccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr [] = {8,2,3,4,5,6,1,4,5,1};
        int key = 1;
        System.out.println(firstoccurance(arr, key,0));
    }
}
