package stringmethods;

public class Stringmethods1 {

	public static void main(String[] args) {
		
		String name ="chakri";//only scp
		String nm = new String("test");//test will store in the heap memory as well as  scp
		//charAt
		System.out.println(name.length());//6
		System.out.println(name.charAt(4));//r
		System.out.println(name.charAt(2));//a
		System.out.println(name.charAt(0));//c
		System.out.println(name.charAt(3));//k
		System.out.println(name.indexOf('r'));//4
		System.out.println(name.indexOf(name));//0
		//index
		String str = "good moring madhapur good evening " ;
		System.out.println(str.indexOf('m',3));
		System.out.println(str.indexOf('m',6));
		System.out.println(str.indexOf('g', 11));
		System.out.println(str.indexOf('g', 1 ));
		System.out.println(str.indexOf('g', 0 ));
		System.out.println(str.indexOf('m'));
		System.out.println(str.indexOf('g',str.indexOf('g', 0 )+1));
		System.out.println(str.indexOf('g',str.indexOf('g',str.indexOf('g', 0 )+1 )+1));
	//replace
		String date = "10/10/2022";
		System.out.println(date.replace("/", "-"));
		String str1 ="GOOD MORING MADHAPUR GOOD EVENING";
		String str2 ="GOOD MORING MADHAPUR GOOD EVENING";
		
		//upper case
		System.out.println(str.toUpperCase());
		//lower case
		System.out.println(str1.toLowerCase());
		//equals
		System.out.println(str.equals(str1));//false
		//equal ignorence
		System.out.println(str.equalsIgnoreCase(str1));
		//substring
		System.out.println(str.substring(6));
		System.out.println(str.substring(11));
		System.out.println(str.substring(19));
		
		//compares
		System.out.println(str.compareTo(str1));
		System.out.println(str2.compareTo(str1));
	
		
		//contains bolean type
		System.out.println(str.contains("good"));
		System.out.println(str.contains("good b"));
		
		//trim spaces should remove
		System.out.println(str.trim());
		
		
		//split spliting from spaces
		str.split(" ");
		     String s [] =str.split(" ");
		     
		     System.out.println(s.length);
		     for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
		
		     int k = 200;
		     int j= 300;
		     System.out.println(k+j);
		     System.out.println( str+k+j);
		     System.out.println( k+j+str);
	}	
}
