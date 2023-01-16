package Mock_Question;

public class removeDublicate {
    public static void main(String[] args) {
        int arr [] = {-1,-5,4,6,-3,2};
        int [] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(arr[i]< 0){
                ans[i] = arr[i];
            }
        }
    }
}
