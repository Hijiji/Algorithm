package 백준.Silver.소트인사이드_1427;

import java.util.*;

public class Main {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] a = new int[str.length()];
        for(int i=0; i<str.length();i++){
            a[i] = Integer.parseInt(str.substring(i,i+1));
        }
       
        for(int i=0;i<a.length;i++){
            int max = i;
            for(int j=i+1;j<a.length;j++) {
                if(a[max]<a[j]){
                    max = j;
                }
            }
            int temp = a[i];
            a[i] = a[max];
            a[max]=temp;
        }
        for (int i : a) {
            System.out.print(i);
        }
    }
}
