package exceptions2;

public class Exceptions3 {

	public static void main(String[] args) {
		System.out.println("mahesh");
		System.out.println("mahesh");
		System.out.println("mahesh");
		System.out.println(10/5);//2
		try {
			System.out.println(10/2);
			System.out.println(10/0);
			
		} catch (ArithmeticException e) {
			
			System.out.println("my error cause is "+e.getMessage());
			System.out.println("my error is"+e.getCause());
			System.out.println("my errors class is"+e.getClass());
		}//undefine
		
		int a[]= {10,20,30,40};
		System.out.println(a.length);
		System.out.println(a[2]);
		try {
			//System.out.println(a[4]);
			System.out.println(a[1]);
		} catch (Exception e) {
			
			System.out.println("my error cause is "+e.getMessage());
			System.out.println("my error is"+e.getCause());
			System.out.println("my errors class is"+e.getClass());
		}//ArrayIndexOutOfBoundsException
		System.out.println(a[3]);
		System.out.println("mahesh");
		
		
		
		
		
		
		
	}
//try block
	//catch..... try-catch exceptional handling
}
