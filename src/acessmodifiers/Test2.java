package acessmodifiers;

public class Test2 {


	
	
	public void didplay() {
		
		Test1 ob =new Test1();//this is only the object
		//System.out.println("private variable "+ob.a);//private variable access in same class only
		System.out.println("default variable" +ob.b);
		System.out.println("protected variable" +ob.c);
		System.out.println("public variable "+ob.d);
	}



}
