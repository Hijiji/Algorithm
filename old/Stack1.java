package old;

import java.util.Scanner;
  
public class Stack1 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    char[] a = in.next().toCharArray();
    int k1=0; String answer="";
    for(int i=0;i<a.length;i++){
      if(a[i]=='(')k1++;
      else if(a[i]==')')k1--;
      if(k1==0 && a[i]!=')') answer+=a[i];
    }
    System.out.println(answer);
  }
}
