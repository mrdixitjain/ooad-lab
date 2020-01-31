import java.util.*;
class IntegerSet{
	private boolean[] a=new boolean[100]; 

	IntegerSet(){
		for(int i=0;i<100;i++)
			a[i]=false;
	}

	public IntegerSet union(IntegerSet b){
		IntegerSet res=new IntegerSet();
		for(int i=0;i<100;i++){
			if(this.a[i] | b.a[i])
				res.insertElement(i);
		}
		return res;
	}

	public IntegerSet intersection(IntegerSet b){
		IntegerSet res=new IntegerSet();
		for(int i=0;i<100;i++){
			if(this.a[i] & b.a[i])
				res.insertElement(i);
		}
		return res;
	}
	public void insertElement(int i){
		this.a[i]=true;
	}
	public void deleteElement(int i){
		this.a[i]=false;
	}

	public String toSetString(){
		String s= "";
		for(int i=0;i<100;i++){
			if(this.a[i])
				s+=Integer.toString(i)+" ";
		}
		if(s.length()==0)
			s+="---";
		return s;
	}

	public boolean isEqualTo(IntegerSet b){
		for(int i=0;i<100;i++){
			if(this.a[i]!=b.a[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args){
		IntegerSet i1 = new IntegerSet();
		IntegerSet i2 = new IntegerSet();
		IntegerSet i3 = new IntegerSet();
		IntegerSet i4 = new IntegerSet();
		IntegerSet i5 = new IntegerSet();

		for(int i=0;i<100;i+=5)
			i1.insertElement(i);

		for(int i=0;i<100;i+=10)
			i2.insertElement(i);


		System.out.println("Set 1 : "+i1.toSetString());
		System.out.println("Set 2 : "+i2.toSetString());
		i3=i1.union(i2);
		System.out.println("Equality of set 1 and 2 : "+i1.isEqualTo(i2));
		System.out.println("union of set 1 and 2 : "+i3.toSetString());
		i4=i1.intersection(i2);
		System.out.println("intersection of set 1 and 2 : "+i4.toSetString());
		System.out.println("set 5 : "+i5.toSetString());

		for(int i=0;i<100;i+=10)
			i2.deleteElement(i);
		System.out.println("after deletion , Set 2 : "+i2.toSetString());

	}

}