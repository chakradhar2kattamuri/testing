package oopsconcept;

public class Methodoveride extends Methodovrerlding {
	public void sum() {
		System.out.println("sum() with 0 parameters in the methodoverriding class");
	}
	public void sum(int i) {
		System.out.println("sum() with 1 parameters in the methodoverriding classs");
	}

	public static void main(String[] args) {
		Methodovrerlding  o = new Methodoveride(); // child class object can be reffered with parent class reference variable

		o.sum();
		o.sum(100);
		o.sum(20, "wag");
		o.sum("ga", 2);// only common methods in the child class and parent class 
		                  //only executed by overriding parent class method  by the child class method 
		                 //during run time, so we are calling it is an dynamic polymorphism
		
		System.out.println(o.x);
	}

}
