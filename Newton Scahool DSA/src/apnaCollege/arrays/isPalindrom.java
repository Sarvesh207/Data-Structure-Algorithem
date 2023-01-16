package apnaCollege.arrays;

public class isPalindrom {
    public static void main(String[] args) {
        int n  = 113;
        int a = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;

        }
        System.out.println(rev);
        if(rev == a){
            System.out.println("is Palindrom");
        }else{
            System.out.println("Not palindrom");
        }

    }
}
