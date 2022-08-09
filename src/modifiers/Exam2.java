package modifiers;

public class Exam2 {

	
	public void display() {
		Exam1 in=new Exam1();
		//System.out.println("private variables is"+(in.a));//access with in the class only
		System.out.println("default variable is"+(in.b));
		System.out.println("protected variable is"+(in.c));
		System.out.println("public variable is"+(in.d));
}
}