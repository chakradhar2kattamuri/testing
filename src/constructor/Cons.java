package constructor;

public class Cons {
	
	

		
	public Cons() {// same name as a class name 
		System.out.println("default   constructor ");
	}
	
	public Cons(int i) {
		System.out.println("1 parameter constructor ");
	}
	public Cons(int k, String name) {
		System.out.println("2 parameters  constructor ");
	}
		
	public void sam (String name , String colour) {
		System.out.println("kia car model name and colour "+ name +"  "+colour);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
	 Cons ob = new Cons();
	new Cons(10);
	new Cons(100);	
	new Cons(10000);	
	new Cons(10,"nani");	
		ob.sam("sonet", "black");
		
		
	}
	
	

}
