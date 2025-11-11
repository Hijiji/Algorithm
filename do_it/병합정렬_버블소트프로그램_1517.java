package do_it;
import java.io.*;
import java.util.*;
/**
 * todo 해석 및 재풀이
 */
public class 병합정렬_버블소트프로그램_1517 {
    public static int[] A, tmp;
    public static long result;

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        A = new int[N+1];
        tmp = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        result = 0;
        mergetSort(1,N);
        bw.write(result+" ");
        bw.flush();
        bw.close();
    }
    public static void mergetSort(int s, int e){
        if(e-s<1)return;
        int m = s+(e-s)/2;

        mergetSort(s,m);
        mergetSort(m+1, e);
        for(int i=s;i<=e;i++){
            tmp[i]=A[i];
        }
        int k=s;
        int index1=s;
        int index2=m+1;
        while(index1<=m&& index2 <=e){
            if(tmp[index1]>tmp[index2]){
                A[k] = tmp[index2];
                result = result+index2-k;
                k++;
                index2++;
            }else{
                A[k] = tmp[index1];
                k++;
                index1++;
            }
        }
        while(index1<=m){
            A[k]=tmp[index1];
            k++;
            index1++;
        }
        while(index2 <= e){
            A[k]=tmp[index2];
            k++;
            index2++;
        }
    }
}
