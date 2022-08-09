
public class Swaping {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		System.out.println("before swaping ");
//		System.out.println(a);
//		System.out.println(b);

//		a= a+b;//30
//		b=a-b;//10
//		a= a-b;//20
		//System.out.println("after swaping");
//		System.out.println(a);
//		System.out.println(b);
		
		
		//or binary values 
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		System.out.println(a);
//		System.out.println(b);
		
		String str1 = "swhizz";
		String str2 = "testing";
		str1= str1+str2;
		System.out.println(str1);
		str2 = str1.substring(0, str1.length()-str2.length());
		System.out.println(str2);
	    str1= str1.substring(str2.length());
	    System.out.println(str1);
		
		
	}

}
