package Mock_Question;

public class find_Min_Max {
    public static void main(String[] args) {
        int a []  = {2,4,7,8,9,5,11,15,25,-10,101};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("maximum element from the array is : "+max);
        System.out.println("minimum element from the array is : "+min);

    }
}
