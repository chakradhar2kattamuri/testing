package constructor1;

public class Cons {
	long l=1255485463526l;//implicit type casting:converting the narrow range of data type into wide range data
	int i=(int)12541526952565l;//explicit type casting:converting wide range data type into narrow range data
	
	
	public Cons() {//same name as class
		
		System.out.println("default parent constractor");
	}
	public Cons (int j) {
		this ();
		System.out.println("one parent parameter"+j);
	}
	public Cons (String name,int y) {
		this (10000);
		System.out.println("two parent  parameters"+name+"  "+y
				);
	}
	public void sam(String name ,String colour) {
		System.out.println("baleno car design"+name+"  "+colour);
	}

	

	public static void main(String[] args) {
		//Cons dm=new Cons();
		
		//new Cons();
		//new Cons(10);
		//new Cons(100);
		//new Cons("mahesh",200);
		//dm.sam("baleno001", "blue");
		
		
		
		
		

	}

}
