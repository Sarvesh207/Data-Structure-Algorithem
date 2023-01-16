package Mock_Question;

import java.util.Scanner;

public class isArmstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int arm = 0;
        while(n!=0){
            int rem = n%10;

             arm += rem*rem*rem;
             n /=10;
        }
        if(x == arm){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
