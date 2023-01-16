package apnaCollege.arrays;

public class countFrequences {
    public  static void countFreq(int arr []){

        for(int i=0; i<arr.length; i++){
            int freq = 0;
            boolean flag = false;
            for(int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
                if(flag == true)
                    continue;
                 freq = 1;

            }
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j])
                    freq++;
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {10,12,10,15,10,20,10,12,12};


    }
}
