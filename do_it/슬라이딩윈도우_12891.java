package do_it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 슬라이딩윈도우_12891 {
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        //S+1 길이 만큼의 A배열 생성
        //fullDNA 배열에 다음 문자열 불러와서 st.nextToken() 하나씩 저장
        //ACGT와 갯수 매칭 각 이름을 딴 int 변수생성
        //ACGT의 총 합은 S 보다 작거나 같은 정수인지 조사필요없네. 보장된다고 함.

        //본격 계산 시작 !
        //i=1,j=P, count=0 초기화
        //j의 크기가 S보다 커져서는 안됨
        //while (j<=S){
        //for(int q=i;q<=P;q++){
        //현재 구간의 acgt 갯수 저장 acgt 변수 생성
        // if (S[q]=='A') a++
        // if (S[q]=='C') c++
        // if (S[q]=='G') g++
        // if (S[q]=='T') t++
        //}// for 종료
        //각 acgt가 ACGT보다 크거나 같으면, 즉 조건을 충족하면
        //i++, j++,  count++
        //아니면 i++; j++;
        //}// while 종료

        //System.out.println(count);
        br.close();
    }
}

