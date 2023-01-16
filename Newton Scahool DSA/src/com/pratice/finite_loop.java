package com.pratice;
import java.util.*;

public class finite_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num = 0;
        for (int i=1; i<=n; i++){
            num= sc.nextInt();
        }
        for (int j=1; j<=n; j++){
            System.out.print(j);
        }

    }
}
