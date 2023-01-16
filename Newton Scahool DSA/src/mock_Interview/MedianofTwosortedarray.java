package mock_Interview;

public class MedianofTwosortedarray {
    static void Merged(int arr1 [], int arr2[]){
        int ptr1 = 0;
        int ptr2 = 0;
        int x = 0;
        int mergedArray [] = new int[arr1.length+arr2.length];

        while(ptr1 < arr1.length && ptr2  < arr2.length){
            if(arr1[ptr1]<=arr2[ptr2]){
                mergedArray[x++] = arr1[ptr1++];
            }
            else{
                mergedArray[x++] = arr2[ptr2++];
            }
        }
        while(ptr1 < arr1.length){
            mergedArray[x++] = arr1[ptr1++];
        }
        while(ptr2 < arr2.length){
            mergedArray[x++] = arr2[ptr2++];
        }

        int n = mergedArray.length;
        if(n%2==0){
            int z = n/2;
            int e = mergedArray[z];
            int p = mergedArray[z-1];
            int ans = (e+p)/2;
            System.out.println("median of two sorted array is : "+ans);
        }
        else
        {
          int z = n/2;
          int ans = mergedArray[z];
            System.out.println("median of two sorted array is : "+ans);
        }


    }
    public static void main(String[] args) {
        int arr1 [] = {1,3};
        int arr2 [] = {2};
        Merged(arr1, arr2);
    }
}
