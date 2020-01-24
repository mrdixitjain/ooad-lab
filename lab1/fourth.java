import java.util.*;
public class fourth{
	static int min(int a,int b){
		return a<b?a:b;
	}
	static int pack(int n,int m,int g){
		/*if(m==0 &&n==0)
			return 0
		if(m==0&&n>=g)
			return g;
		if(n==0&&5*m>=g){
			if(g%5==0)
				return g/5;
			else
				return g/5+1;
		}*/
		int cnt=0;
		while(m>0&&g>0){
			g=g-5;
			m=m-1;
		}
		while(n>0&&g>0){
			g=g-1;
			n=n-1;
			cnt++;
			if(n==0&&g>0){
				cnt=-1;
				break;
				}
		}
		return cnt;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int g=sc.nextInt();
		int min=pack(n,m,g);
		System.out.println(min);
	}
}
