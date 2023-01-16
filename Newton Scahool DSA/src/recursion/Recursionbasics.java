package recursion;

public class Recursionbasics {
    public static void printDec(int n ){
        if(n == 1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }
    public static void printInc(int n){
        if(n==0)return;
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        //printDec(10);
        printInc(10);
    }
}
