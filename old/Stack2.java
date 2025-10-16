package old;
import java.util.Scanner;
  
public class Stack2 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    char[] a = in.next().toCharArray();
    int k1=0,k2=0; String answer="YES";
    for(int i=0;i<a.length;i++){
      if(a[0]==')' || a[a.length-1]=='('){answer="NO"; break;}
      if(a[i]==')')k1++;
      else k2++;
    }
    if(k1!=k2)answer="NO";
    
    System.out.println(answer);
  }
}