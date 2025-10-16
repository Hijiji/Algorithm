package 백준.Bronze.수정렬하기_2750;

import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception{
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int[] a = new int[N];
         for(int i=0;i<N;i++){
             a[i]=sc.nextInt();
         }
         Arrays.sort(a);
        for(int i=0;i<N;i++){
           System.out.println(a[i]);
        }
    }
}
