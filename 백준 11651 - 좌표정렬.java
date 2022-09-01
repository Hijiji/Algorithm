import java.util.*;

class Compare implements Comparable<Compare>{
	int x,y;
	Compare(int x,int y){ 
		this.x=x; this.y=y;
	}
	public int compareTo(Compare c){
		if(this.y==c.y) return this.x-c.x;
		else return this.y-c.y;
	}
}
class Main{
	public static void main (String args[]){
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Compare> cList=new ArrayList<>();
		for(int i=0;i<n;i++){
			cList.add(new Compare(in.nextInt(), in.nextInt()));
		}
		Collections.sort(cList);
		for(Compare c:cList) System.out.println(c.x+" "+c.y);
	}
}