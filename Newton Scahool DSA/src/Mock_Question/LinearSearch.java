package Mock_Question;

public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {4,5,6,7,8,9,11,15,16,20,25};
        int target = 25;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target found at index at : "+i);
            }

        }
    }
}
