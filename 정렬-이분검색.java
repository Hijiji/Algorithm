/*
문제 - 이분검색

설명 :
임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.

입력 : 
첫 줄에 한 줄에 자연수 N(3<=N<=1,000,000)과 M이 주어집니다.두 번째 줄에 N개의 수가 공백을 사이에 두고 주어집니다.

출력 : 
첫 줄에 정렬 후 M의 값의 위치 번호를 출력한다.

예시입력 : 
8 32
23 87 65 12 57 32 99 81

예시출력 : 
3
*/
import java.util.*;

class Main{
	public static void main(String args[]){
    	Scanner in=new Scanner(System.in);
      	int n=in.nextInt(), m=in.nextInt();
      	int[] arr=new int[n];
      	for(int i=0;i<n;i++) arr[i]=in.nextInt();
      	Arrays.sort(arr);  //오름차순 정렬
      
      	int lt=0, rt=n-1, answer=0;
       
      	while(lt<=rt){ //lt와 rt가 같거나, lt가 rt보다 작아야만 while이 돌아간다. lt와 rt가 동일할 때, 정답이된다.
        	int mid=(lt+rt)/2;  //중간값 구하기

			if(arr[mid]==m){
          	    answer=mid+1; break;
                //정답발견 !
            }else if(arr[mid]>m){
          	    rt=mid-1;
                //검색할 데이터를 반으로 줄여줌
            }else{
          	    lt=mid+1;
                //검색할 데이터를 반으로 줄여줌
            }
        }
      System.out.print(answer);
    }
}