package do_it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * todo 다시
 */
public class 슬라이딩윈도우_DNA_12891 {
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        char[] K = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        int[] checkArr = new int[4];
        checkArr[0] = Integer.parseInt(st.nextToken());
        checkArr[1] = Integer.parseInt(st.nextToken());
        checkArr[2] = Integer.parseInt(st.nextToken());
        checkArr[3] = Integer.parseInt(st.nextToken());

        //본격 계산 시작 !
        //i=1,j=P, count=0 초기화
        int[] myArr = new int[4];
        int count=0;
        for(int i=0;i<P;i++){
            add(K[i], myArr);
        }
        if(check(myArr,checkArr)) count++;

        for(int i=P;i<S;i++){
            add(K[i],myArr);
            remove(K[i-P],myArr);
            if(check(myArr, checkArr))count++;
        }

        System.out.println(count);
        br.close();
    }
    private static void add(char c, int[] arr){
        switch(c){
            case 'A': arr[0]++; break;
            case 'C': arr[1]++; break;
            case 'G': arr[2]++; break;
            case 'T': arr[3]++; break;
        }
    }

    private static void remove(char c, int[] arr){
        switch(c){
            case 'A':arr[0]--; break;
            case 'C':arr[1]--; break;
            case 'G':arr[2]--; break;
            case 'T':arr[3]--; break;
        }
    }

    private static boolean check(int[] myArr, int[] checkArr){
        for(int i=0; i<4; i++){
            if(myArr[i]<checkArr[i]) return false;
        }
        return true;
    }
}

