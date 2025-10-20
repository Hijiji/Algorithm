
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N;i++) a[i] = sc.nextInt();

        for(int i=1;i<N;i++){
            int j = i-1;
            int key = a[i]; 
            while(j>=0 && a[j]>key) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }//for end
        int sum = 0;
        int result = 0;
        for(int i=0;i<N;i++)
        {
            sum += a[i];
            result += sum;
        }
        System.out.println(result);
    }
}
