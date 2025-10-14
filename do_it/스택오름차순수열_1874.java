package do_it;
import java.io.*;
import java.util.*;

public class 스택오름차순수열_1874 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N; i++){
            a[i] = scanner.nextInt();
        }
        int[] c = new int[N];
        Stack<Integer> stack = new Stack<>();
        int cN = 1;
        StringBuffer bf = new StringBuffer();
        boolean result = true;
        for(int i=0; i<N; i++){
            if(a[i]>=cN) {
                while (a[i] >= cN) {
                    stack.push(cN++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int b = stack.pop();
                if(b>a[i]) {
                    System.out.print("NO");
                    result = false;

                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if(result)System.out.print(bf.toString());
    }

    //a 랑 c 랑 같은지 비교 : 같으면 넘어감, 다르면 No출력

}
