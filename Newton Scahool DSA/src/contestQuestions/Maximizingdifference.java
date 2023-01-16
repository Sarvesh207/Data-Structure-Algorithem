package contestQuestions;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Maximizingdifference {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1 [] = new int[n];
        int arr2 [] = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            arr2[i]= sc.nextInt();
        }

        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<n; i++){
            list1.add(Math.max(arr1[i], arr2[n-1-i]));
            list2.add(Math.min(arr1[i],arr2[n-1-i]));
        }

        System.out.println(list1);
        System.out.println(list2);


//        long sum1 = 0;
//        long sum2 = 0;
//        for(int i=0; i<n; i++){
//            sum1 += list1.get(i);
//            sum2 += list2.get(i);
//        }
//
//
//        System.out.println(sum1-sum2);


    }
}
