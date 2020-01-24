import java.util.*;
import java.util.Random; 
public class first{
	static int[][] multiply(int[][] a,int[][] b,int n){
		int[][] c=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int sum=0;
				for(int k=0;k<n;k++){
					sum+=a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
		}
		return c;
	}
	static void printMat(int[][] a,int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
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
		int b[][]=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				b[i][j]=sc.nextInt();
			}
		}
		
		int[][] res=multiply(a,b,n);
		printMat(a,n);
		printMat(b,n);
		printMat(res,n);
	}
}
