package mock_Interview;
/**Problem 1: Given two integers m and n and the next two lines has m and n digited numbers separately. Find the sum of the numbers digit by digit and print it.

 Input:

 3 2

 1 9 9

 2 5

 Output:

 2 2 4
 * */

public class DSAMedium {
    public static void main(String[] args) {
        int a [] = {9,9};
        int b [] = {9,9};
        int ptr1 = a.length-1;
        int ptr2 = b.length-1;
        int ans [] = new int[a.length];
        int x = ans.length-1;
        int carry = 0;
        while(ptr1 >= 0 && ptr2 >=0){
              int temp = a[ptr1]+b[ptr2]+carry;
              carry = temp/10;
             int rem =  temp %10 ;
             ans [x--] = rem;
             ptr1--;
             ptr2--;

        }
        while(ptr1 >= 0){
            int temp = a[ptr1]+carry;
            carry = temp/10;
            int rem =  temp %10 ;
            ans [x--] = rem;
            ptr1--;

        }
        while(ptr2 >=0){
            int temp = b[ptr2]+carry;
            carry = temp/10;
            int rem =  temp %10 ;
            ans [x--] = rem;
            ptr2--;

        }

        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
