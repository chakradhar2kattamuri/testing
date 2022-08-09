
package abstraction;

public abstract class Abstraction {
int k;
	public abstract void sum();
	public void sub() {
		System.out.println("sub method in abstract class");
		
	}
	
}

// hiding the unnecessary data
//abstraction method : the method which is not having method body
//abstraction class have main method
// in abstract class can do initialise  the variables
// also have normal methods
// we can not create an object because some unimplemented methods
