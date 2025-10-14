package do_it;
import java.util.*;
public class 카드게임_2164 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1;
        Queue<Integer> q = new LinkedList<>();
        while(a<=N)
        {
            q.add(a++);
        }
        while(q.size()>1) {
            q.poll();
            q.add(q.peek());
            q.poll();
        }

        System.out.println(q.peek());
    }
}
