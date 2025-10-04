package do_it;

import java.util.Scanner;

public class 구간합_11653 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] A = new int[N+1];
        int[] S = new int[N+1];

        for (int i = 1; i < N+1; i++) {
            int t = input.nextInt();
            A[i] = t;
            S[i] = S[i - 1] + t;
        }

        for (int j = 0; j < M; j++) {
            int k = input.nextInt();
            int l = input.nextInt();

            System.out.println(S[l] - S[k - 1]);
        }
    }
}