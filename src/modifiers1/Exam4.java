package modifiers1;

import modifiers.Exam1;

public class Exam4  {
	Exam1 im=new Exam1();
	
	public void display() {
		//System.out.println("private variables is"+(im.a));//access with in the class only
		//System.out.println("default variable is"+(im.b));//access with in the package only
		//System.out.println("protected variable is"+(im.c));//access with in the package and access childs of the other packages
		System.out.println("public variable is"+(im.d));
	}

}
