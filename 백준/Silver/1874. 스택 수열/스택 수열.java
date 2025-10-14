import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        boolean result = true;
        int cN = 1; // 현재 push할 숫자

        for (int i = 0; i < N; i++) {
            int target = a[i];

            if (target >= cN) {
                while (target >= cN) {
                    stack.push(cN++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                // 스택의 top이 지금 만들어야 하는 수열값과 같아야 함
                if (stack.peek() == target) {
                    stack.pop();
                    bf.append("-\n");
                } else {
                    System.out.print("NO");
                    result = false;
                    break;
                }
            }
        }

        if (result) System.out.print(bf.toString());
    }
}
