package do_it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 좋은수구하기_1253 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] A = new int[N];
        for(int i = ; i < N; i++){
            A[i]=Integer.parseInt(br.readLine());
        }
        for(int i = 1; i < N; i++){
            int l=0;
            int m=N;
            while(l<m) {
                if (A[i]==A[l]+A[m]){
                    count++;

                }
            }
        }
    }
}
