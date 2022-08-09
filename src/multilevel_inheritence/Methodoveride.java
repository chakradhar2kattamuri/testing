package multilevel_inheritence;

public class Methodoveride extends Methodoverloading {
	
	
	public void sum() {
		System.out.println("sum() with 0 parameters methodoveride the class");
	}
	public void sum(int x) {
		System.out.println("sum () with 1 parameter methodoveride the class");
	}
	public void sub(int x) {
		System.out.println("sub () with 1 parameter methodoveride the class");
	}
	

	
	
public static void main(String []args) {
	
	Methodoverloading ob=new Methodoveride ();//child class object can be referred with parent class reference
	ob.sum();
	ob.sum(100);
	ob.sum(200, "swhizz");
	ob.sum("Swhizz", 200);
System.out.println(ob.x);
	
		
	}
}

