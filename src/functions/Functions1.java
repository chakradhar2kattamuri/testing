package functions;

public class Functions1 {
	int a=10;
	int b=20;
	int c=30;
	public void sum() {
		System.out.println("addition of a and b"+(a+b));
		//no return no argument
		
	}
	//no return with some argument
	public void sub(int m,int n) {
	int	z=m-n;
	System.out.println("subtraction af m and n"+(m-n));
		
	}
	//return with no arguments
	public int div() {
	int	d=a/b;
	System.out.println("division a and b "+(a/b));
		return d;
		
		
		
		
	}
	//return with some arguments
	public String method(String username,String password) {
		String credentials=username+password;
		System.out.println("the user credentials are"+(username+password));
		return credentials;
		
		
		
		
	}
	

}
