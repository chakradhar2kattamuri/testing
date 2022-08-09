package multilevel_inheritence;

public class Methodoverloading {//with in the same class,if we write the methods with same method name with different arguments and different orders of the parameters,different data types of tyhe argument ,when we call that is method overloading
	
	
	int x=100;
	public void sum() {
		System.out.println("sum() with 0 parameters");
	}
	public void sum(int x) {
		System.out.println("sum () with 1 parameter"+(x));
	}
	public void sum(int x,String y) {
		System.out.println("sum() with 2 parameters"+(x+y));
	}
	public void sum(String y ,int x) {
		System.out.println("sum() with reverse order"+(y+x));
	}
		public static void main(String[] args) {
		//some of the method with same name with different parameters,different orders


	}
}




	

