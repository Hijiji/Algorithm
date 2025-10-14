package do_it;
import java.io.*;
import java.util.*;

public class 오큰수구하기_17298 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] su = new int[N]; //배열에 수열 저장
        int[] result = new int[N]; //결과

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
             su[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0); //stack에는 index를 저장
        for(int i=1; i<N;i++){
            while(!stack.isEmpty() && su[stack.peek()]<su[i]) { // 현재 stack top이  su[i]보다 작으면
                // su[i]의 값을 result[stack.pop]에 추가
                result[stack.pop()] = su[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) //남은 stack 갯수만큼
        {
            result[stack.pop()] =-1;
        }
        for(int i=0;i<N;i++){
            System.out.print(result[i]+" ");
        }
    }
}
