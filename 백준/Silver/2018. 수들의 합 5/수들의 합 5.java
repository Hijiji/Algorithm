import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //정수 N 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
     
        //변수 초기화
        int count =1;
        int sum =1;
        int start=1;
        int end = 1;

        //반복 안에서 start,end 둘다 1부터 시작.
        //합산값이 N 보다 작으면 뒷포인터 ++
        // 크면 앞포인터 ++
        // 같으면 둘다 ++,count++
        while(end!=N){
            if (sum==N) {
                end++;
                count++;
                sum += end;
            } else if (sum<N) {
                end++;
                sum+=end;
            }else{
                sum-=start;
                start++;
            }
        }
        System.out.println(count);
    }
}
