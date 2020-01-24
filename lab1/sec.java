import java.util.*;
import java.util.Random; 
public class sec{
	static void printMat(int[][] a,int in,int fi,int jin,int jfi){
		for(int i=in;i<=fi;i++){
			for(int j=jin;j<=jfi;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		return;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=rand.nextInt(10);
			}
		}
		int m=sc.nextInt();
		if(n%m!=0)
			return;
		printMat(a,0,n-1,0,n-1);	
			
		int i=0,j=m-1,i2=0,j2=m-1;
		while(j<n){
			printMat(a,i,j,i2,j2);
			if(j2==n-1){
				i+=m;
				j+=m;
				//System.out.println(j2);
				i2=0;
				j2=m-1;
				continue;
			}	
			i2+=m;
			j2+=m;
		}
			
	}
}
