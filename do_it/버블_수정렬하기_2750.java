package do_it;
import java.util.*;
public class 버블_수정렬하기_2750 {
    public static void main(String[] args)throws Exception{
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int[] a = new int[N];
         for(int i=0;i<N;i++){
             a[i]=sc.nextInt();
         }
         //Arrays.sort(a);
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1-i; j++) {
                if(a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }
            }//for1
        }//for2
        for (int i = 0; i < N; i++) {
            System.out.println(a[i]);
        }
    }
}
