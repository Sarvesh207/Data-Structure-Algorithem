package assignment;
import java.util.*;

public class boundryTravalsal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int index = 0; index < T; index++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // ? print first row
            for (int i = 0; i < M; i++) {
                System.out.print(arr[0][i] + " ");
            }
            // ? print last colum except first coloum
            for (int i = 1; i < N; i++) {
                System.out.print(arr[i][M - 1] + " ");
            }
            // ? print last coloum except last coloum
            if (N > 1) {
                for (int i = M - 2; i >= 0; i--) {
                    System.out.print(arr[N - 1][i] + " ");
                }
            }
            // ? print first colum expect fist and last row
            if (M > 1) {
                for (int i = N - 2; i > 0; i--) {
                    System.out.print(arr[i][0] + " ");
                }
            }
            System.out.println();
        }

    }
}
