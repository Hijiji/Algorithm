package do_it;
import java.util.*;

public class 삽입정렬_ATM인출시간계산_11399 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N;i++) a[i] = sc.nextInt();

        for(int i=1;i<N;i++){
            int j = i-1;
            int key = a[i]; // 위치가 계속 변하기 때문에 key로 빼둠
            while(j>=0 && a[j]>key) {
                //1번방부터 조회  앞xml 값을 비교하여 앞보다 작으면 앞으로. 작으면 앞으로. 반복. -> 뒤에 값은 비교 안함
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key; // 앞칸 비워놓고 한칸씩 뒤로 미루다가 다 미뤄졌을때, 젤 앞칸에 key채움
        }//for end
        int sum = 0;
        int result = 0;
        for(int i=0;i<N;i++)//합산값 출력
        {
            sum += a[i];
            result += sum;
        }
        System.out.println(result);
    }
}
