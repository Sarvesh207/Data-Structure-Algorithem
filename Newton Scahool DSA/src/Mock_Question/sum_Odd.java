package Mock_Question;

import java.util.Scanner;

public class sum_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a [] = new int[n];
        for(int i=0;i<n; i++) {
            a[i] = sc.nextInt();
        }
        int oddSum = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2 == 1){
                oddSum += a[i];
            }
        }
        System.out.println(oddSum);
    }
}
