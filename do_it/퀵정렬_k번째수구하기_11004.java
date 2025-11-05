package do_it;
import java.util.*;
import java.io.*;

public class 퀵정렬_k번째수구하기_11004 {
    public static void quickSort(int[] A, int S, int E, int K){
        if(S<E){
            int pivot = partition(A,S,E);
            if(pivot==K) return;
            else if(pivot>K) quickSort(A, S, pivot-1, K);
            else quickSort(A,pivot+1, E, K);
        }
    }

    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i]=A[j];
        A[j]=temp;
    }

    public static int partition(int[] A, int S, int E){
        if(S+1==E){
            if(A[S]>A[E]) swap(A,S,E);
            return E;
        }

        int M = (S+E)/2;
        swap(A,S,M); // 피봇을 제일 앞으로 이동 - 계산의 편의를 위함
        int pivot = A[S];
        int i=S+1,j=E;

        while(i<=j){
            while(j>=S+1 && pivot < A[j]){
                j--;
            }
            while (i <= E && pivot > A[i]) {
                i++;
            }
            if(i<=j) swap(A,i++,j--);

        }
        A[S]= A[j];
        A[j] = pivot;
        return j;
    }

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++) A[i] = Integer.parseInt(st.nextToken());

        quickSort(A, 0, N-1, K-1);

        System.out.println(A[K-1]);

    }
}
/**

 // pivot 정하기 : 배열의 가운데 숫자
 int p = 0;
 // 반복문
 for(){
 //피봇을 배열의 가장 앞으로 옮기기
 if (A[p]==A[K]) {
 System.out.print(p);
 return;
 } else if(A[p]<A[K]) {//p의 오른쪽에서만 정렬
 int i=1;
 int j=A[p]-1;
 while(i<j){
 if(i>A[p]){

 }else if(j<A[p]){

 }else if(){

 }
 }//while 종료
 } else { //p의 왼쪽에서만 정렬

 }
 }//for 종료
 */