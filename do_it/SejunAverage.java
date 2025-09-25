package do_it;
import java.util.Scanner;

public class SejunAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //사이즈에 맞는 배열 생성
        int[] A=new int[N];
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
        /**
         *   정수 연산에서는 순서가 중요하다.
         *   정수나눗셈은 소수점을 버리기 때문에 값이 작아짐
         *   곱셈 먼저하면 값이 커져서 소수점 손실이 줄어듬
         *   100.0을 넣으면 double 연산이 되어 소수점까지 정확하게 계산가능함
         */
        System.out.println(sum*100.0/max/N);
    }
}