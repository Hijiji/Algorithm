
import java.io.*;
import java.util.*;


public class Main {
    static class Node{
        int index;
        int value;
        Node(int index, int value){
            this.index = index;
            this.value = value;
        }
}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Node> deque = new LinkedList<>();

        //N만큼 반복 -> 처음부터 들어오는 숫자가 뭔지 보면서 deque에 넣음.
        // 2번째 부터는, 기존에 있는 숫자들보다 크면 뒤로 입력,
        // 기존 숫자가 더 크면, 기존 숫자를 뒤에서 삭제, 계속삭제
        //앞에 있는 숫자가 i-L+1보다 작으면 앞에서 삭제
        //deque 선언할 class Node 생성 Node(index, value) :: 별도의 값을 넣어주는것임
        //bw flush, close
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int now = Integer.parseInt(st.nextToken());
            while(!deque.isEmpty()&&deque.getLast().value>now)
                deque.removeLast();
            deque.addLast(new Node(i, now));
            if(deque.getFirst().index<i-L+1)
                deque.removeFirst();
            bw.write(deque.getFirst().value+" ");
        }
        bw.flush();
        bw.close();
    }
}
