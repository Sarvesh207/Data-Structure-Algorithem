package Strings;

public class PalindromeString {
   /* public static boolean isPalinrome(String str){

        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i));{
                return false;
            }

        }
        return true;
    }

    */
       //2nd Approch
    public static boolean isPalindrom(String str){
        int ptr1 = 0;
        int ptr2 = str.length()-1;

        while(ptr1<=ptr2){
            char c1 = str.charAt(ptr1);
            char c2 = str.charAt(ptr2);
           if ( c1 == c2 ){
               ptr1++;
               ptr2--;
            }else {
              return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrom(str));
    }
}
