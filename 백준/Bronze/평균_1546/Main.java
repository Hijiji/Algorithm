package 백준.Bronze.평균_1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //사이즈에 맞는 배열 생성
        int A[]=new int[N];
        //max 변수 생성
        long max=0;

        for(int i=0;i<N;i++){
            //배열에 next int
            //더 큰수 찾기 - max에 넣기
            int t = sc.nextInt();
            if(max<t)max=t;
            A[i]= t;
        }
        long sum =0;
        //for 문 한번더 돌면서 합산
        for(int i=0;i<N;i++){
            sum += A[i];
        }
        //원점수/젤큰수*100/총갯수
        System.out.println(sum*100.0/max/N);
    }
}