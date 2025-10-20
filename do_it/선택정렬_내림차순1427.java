package do_it;
import java.util.*;

public class 선택정렬_내림차순1427 {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] a = new int[str.length()];
        for(int i=0; i<str.length();i++){
            a[i] = Integer.parseInt(str.substring(i,i+1));
        }
        //배열중 가장 큰 수를 찾아서 앞에 배치하기.
        //그다음번에는 배치된 다음 배열에서만 정렬하기.
        //이중 for문
        for(int i=0;i<a.length;i++){ //0번방부터 시작
            //여기서 메인 반복 //i의 +1부터 비교, 비교해서 더 크면 temp에 담아
            int max = i;
            for(int j=i+1;j<a.length;j++) {
                if(a[max]<a[j]){
                    max = j;
                }
            }//for1
            int temp = a[i];
            a[i] = a[max];
            a[max]=temp;
            //마지막에 남은 temp를 i에 할당, i는 젤 큰수의 인덱스로 할당
        }//for2
        for (int i : a) {
            System.out.print(i);
        }
    }
}
