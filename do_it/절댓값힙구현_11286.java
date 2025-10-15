package do_it;

import java.util.*;
import java.io.*;

public class 절댓값힙구현_11286 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선언

        int N = Integer.parseInt(br.readLine());

        //큐에 절댓값이 작은수부터 순서대로 정렬해서 저장, 절댓값이 같을 경우 마이너스가 작은수임
        PriorityQueue<Integer> q= new PriorityQueue<>((o1,o2)->{
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs)
                return o1>o2?1:-1;
            else
                return first_abs-second_abs;
        });


        for(int i=0;i<N;i++){
            int a = Integer.parseInt(br.readLine());
            if (a==0) { //입력된 숫자가 0일 경우 배열의 가장 작은 절댓값을 출력 ! 값을 배열에서 제거
                if(q.isEmpty()){ //배열이 비어있을 경우 0을 출력
                    bw.write("0\n");
                    //System.out.println("0");
                }else {
//                    System.out.println(q.peek());
                    bw.write(q.peek()+"\n"); //젤 앞에 있는 값 출력
                    q.poll(); // 젤 앞에있는 값제거
                }
            }else{
                q.add(a);
            }
        }
        bw.flush();
        bw.close();
    }
}
