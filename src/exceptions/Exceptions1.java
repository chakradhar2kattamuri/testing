package exceptions;

public class Exceptions1 { 

	public static void main(String[] args) {
		System.out.println("chakri");
		System.out.println("chakri");
		System.out.println("chakri");

		System.out.println(10/2);//5

		try {
			System.out.println(10/0);
			System.out.println(20/5);
		} catch (ArithmeticException e) {

			System.out.println("my error cause is"+e.getCause());
			System.out.println("my error is "+e .getMessage());
			System.out.println("my error is "+e.getClass());
		}//undifine or infinate

		int a[] = {100,200,300,400};
		System.out.println(a.length);
		try {
			System.out.println(a[4]);
			System.out.println(a[2]);
		} 
		
		catch (Exception e) {
			System.out.println("my error cause is"+e.getCause());
			System.out.println("my error is "+e .getMessage());
			System.out.println("my error is "+e.getClass());



		}
		//ArrayIndexOutOfBoundsExcept4ion

		System.out.println(a[3]);
		System.out.println("chakri");
		System.out.println("chakri");
	}
	

}

//try block
//catch ...try catch exception