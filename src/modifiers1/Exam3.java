package modifiers1;

import modifiers.Exam1;

public class Exam3 extends Exam1{
	
	
	public void display() {
		//System.out.println("private variables is"+a);// access with in the class only
		//System.out.println("default variable is"+b);// access with in package only
		System.out.println("protected variable is"+c);
		System.out.println("public variable is"+d);

	}

}
