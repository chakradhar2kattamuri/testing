package acessmodifiers2;
import acessmodifiers.Test1;


public class Test3  extends Test1  {
	
	public void display() {
		
		
		
	//System.out.println("private variable "+a);//private variable access in same class only
	//System.out.println("default variable" +b);// only access on with in the same package
	System.out.println("protected variable" +c);
	System.out.println("public variable "+d);
}

}
