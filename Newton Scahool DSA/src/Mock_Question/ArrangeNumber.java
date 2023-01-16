package Mock_Question;

public class ArrangeNumber {
    public static void main(String[] args) {
        int arr []  = {-2,5,6,-3,1,-1};
        int j = 0;
        int newArr [] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                newArr[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                newArr[j] = arr[i];
                j++;
            }
        }



        for(int i = 0;i<arr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
