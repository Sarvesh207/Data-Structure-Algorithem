package apnaCollege.arrays;

public class RemoveDublicate {
    static int removeDublicate(int arr[]){
        int n  = arr.length;
        int temp [] = new int[n];
        temp [0] = arr[0];
        int res = 1;
        for(int i=1; i<n; i++){
            if(temp[res-1]!= arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i=0; i<res; i++){
            arr[i] = temp[i];
        }
        for(int i=0; i<res; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        return res;
    }
    //another approch
    static void reDublicate(int arr []){
        int res = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!= arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        for(int i=0; i<res; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,1,2,2,3,3};
        //int ans = removeDublicate(arr);
        reDublicate(arr);
        //System.out.println(ans);
    }
}
