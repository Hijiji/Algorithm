package 백준.Gold.좋다_1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i]=Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);
        for(int i =0; i < N; i++){
            int l=0;
            int m=N-1;
            while(l<m) {
                if (A[i]==A[l]+A[m]) {                    
                    if(l!=i&&m!=i){
                        count++;
                        break;
                    }else if (l == i) {
                        l++;
                    } else if (m == i) {
                        m--;
                    }
                }else if(A[i]>A[l]+A[m]){
                    l++;

                }else{
                    m--;
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}
