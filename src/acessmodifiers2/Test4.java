package acessmodifiers2;
import acessmodifiers.Test1;
public class Test4 {
	public void display() {
		
		Test1 ob =new Test1();
	//System.out.println("private variable "+ob.a);
	//System.out.println("default variable" +ob.b);
	//System.out.println("protected variable" +ob.c);// access with in the same package as well as child class of other packages
	System.out.println("public variable "+ob.d);// access by any where in the project
}


}
