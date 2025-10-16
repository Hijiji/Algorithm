package do_it;
import java.io.*;
import java.util.*;

class Box implements Comparable<Box>{
    int value, index;
    public Box(int value, int index){
        super();
        this.value=value; this.index=index;
    }
@Override
    public int compareTo(Box o) {
        return this.value-o.value;
    }
}

}
public class 버블소트프로그램_1377 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        Box[] a = new Box[N];

        for(int i=0;i<N;i++){
            a[i] = new Box(Integer.parseInt(br.readLine()),i);
        }
        int result = 0;
        Arrays.sort(a);
        for(int i=0;i<N;i++){
            if(result < a[i].index-i){
                result = a[i].index-i;
            }
        }
        System.out.println(result+1);
    }
}
