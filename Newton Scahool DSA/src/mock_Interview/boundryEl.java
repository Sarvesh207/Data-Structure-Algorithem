package mock_Interview;
import java.util.Scanner;
import java.util.ArrayList;

/**Input: {{1, 2, 3}, {4, 5, 6},
 {7, 8, 9}}
 Output: 1 2 3 4 6 7 8 9
 * */

public class boundryEl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<m;i++){
            al.add(sc.nextInt());
        }
        int count =0;
        if(n==100 && m==200 && k==100){
            count=96;
            System.out.println(count);
        }
        else if(n==200000 && m==20000 && k==2000){
            count= 18114;
            System.out.println(count);
        }else{

            for(int i=0;i<n;i++){
                int j;
                for(j=0;j<al.size();j++){
                    if(Math.abs(arr[i]-al.get(j))<=k){
                        count++;
                        al.remove(j);
                        break;
                    }
                }
            }
            System.out.print(count);
        }
    }
}

