package oopsconcept;




public class Methodovrerlding { // with the same class ,if we write the methods with same  method name with different arguments,
	                            //with different order of the parameters,
	                           
	  int x = 100;   
	  //different data types of the arguments ,then we call that method over loding
	public void sum() {
		System.out.println("sum() with 0 parameters");
	}
	public void sum(int x) {
		System.out.println("sum() with 1 parameters");
	}
	public void sum(String k ,int x) {
		System.out.println("sum() with 2 parameters");
	}

	public void sum(int x ,String s) {
		System.out.println("sum() with 0 parameters");
	}	


	public static void main(String[] args) {


	}

}
