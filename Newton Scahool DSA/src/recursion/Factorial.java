package recursion;

import javax.accessibility.AccessibleValue;

public class Factorial {
    public static int calFact(int n ){
        if(n == 0)return 1;
        int fnm1 = calFact(n-1);
        int fact = n*fnm1;
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calFact(n));
    }
}
