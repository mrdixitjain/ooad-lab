import java.util.*;
import java.lang.*;
public class third{
	static void pigLatin(String s){
		int ind=-1;
		StringBuilder st=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
				ind=i;
				break;
			}
			else{
				st.append(s.charAt(i));
			}
		}
		if(ind==-1){
			System.out.print(st);
			System.out.println("ay");
			return;
		}
		for(int i=ind;i<s.length();i++){
			System.out.print(s.charAt(i));
		}
		System.out.print(st);
		if(ind==0)
			System.out.print("way");
		else
			System.out.print("ay");
		System.out.println();
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		String lis[]=inp.split(" ");
		for(String s: lis)
			pigLatin(s);
	}
}
