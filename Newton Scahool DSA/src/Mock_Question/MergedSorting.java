package Mock_Question;

public class MergedSorting {
    static void merged(int arr [], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        merged(arr, si, mid);
        merged(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    static void merge(int arr [], int si, int mid, int ei){
        int temparr [] = new int[ei-si+1];
        int ptr1 = si;
        int ptr2 = mid+1;
        int x = 0;
        while(ptr1<=mid && ptr2<=ei){
            if(arr[ptr1]<arr[ptr2]){
                temparr[x++] = arr[ptr1++];
            }else{
                temparr[x++]= arr[ptr2++];
            }
        }
        while(ptr1<=mid){
            temparr[x++] = arr[ptr1++];
        }
        while(ptr2<=ei){
            temparr[x++]= arr[ptr2++];
        }

        for(int i=0, j=si; i<temparr.length; i++, j++){
            arr[j] = temparr[i];
        }
    }
    static void print(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr []  = {2,7,1,5,3,11};
        merged(arr, 0, arr.length-1);
        print(arr);
    }
}
