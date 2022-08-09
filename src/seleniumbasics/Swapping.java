package seleniumbasics;

public class Swapping {

	public static void main(String[] args) {
		
		//int type swapping
		
		int a=10;
		int b=20;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		
//		a=a+b;//30
//		b=a-b;//10
//		a=a-b;//20
//		System.out.println("after swapping");
//		System.out.println(a);
//		System.out.println(b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		
		
		//string type swapping

		String str1="swhizz";//6
		String str2="testing";//7
		
		str1=str1+str2;//13
		System.out.println(str1);
		str2=str1.substring(0,str1.length()-str2.length());
		System.out.println(str2);
		str1=str1.substring(str2.length());
		System.out.println(str1);
		
		
	}

}
