package recursion;

public class SumofnthEl {
    public static int calSum(int n ){
        if(n == 1){
            return 1;
        }
        int total = 0;
        int curSum = n + calSum(n-1);
        total += curSum;
        return curSum;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(calSum(n));
    }
}
