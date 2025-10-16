package old;
import java.util.*;
  
public class Collection1 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int day = in.nextInt();
    int num = in.nextInt();
    int arr[]=new int[day];
    String answer=""; int lt=0;
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int i=0;i<day;i++) arr[i]=in.nextInt();
    for(int i=0;i<num-1;i++)map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    for(int rt=num-1;rt<day;rt++){
      map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
      answer+=map.size()+" ";
      map.put(arr[lt],map.get(arr[lt])-1);
      if(map.get(arr[lt])==0)map.remove(arr[lt]);
      lt++;
    }                      
    System.out.println(answer);
  }
}
