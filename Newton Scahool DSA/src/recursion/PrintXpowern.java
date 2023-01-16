package recursion;

public class PrintXpowern {
    public static int calPowerofa(int a , int n){
        if(n == 0){
            return 1;
        }
//        int anm1 = calPowerofa(a,n-1);
//        int aPn = a*anm1;
        return a*calPowerofa(a,n-1);
    }
    public static int OptmizedcalPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = OptmizedcalPower(a, n/2);
        int halfPower = halfPowerSq*halfPowerSq;
        if(n % 2 != 0){
            halfPower = a*halfPower;
        }
        return halfPower;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 2;
        //System.out.println(calPowerofa(a,n));
        System.out.println(OptmizedcalPower(a,n));
    }
}
