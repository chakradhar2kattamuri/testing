package stringmethods2;

public class Stringmethods3 {

	public static void main(String[] args) {

		String name="mahesh";// only scp 
		String nm=new String ("mahesh");//mahesh will be stored heap memory as well as scp 
		//length
		System.out.println(name.length());//6
		//charat
		System.out.println(name.charAt(5));//h
		System.out.println(name.charAt(3));//e
		System.out.println(name.charAt(2));//h
		System.out.println(name.charAt(0));//m
		System.out.println(name.indexOf('m'));//0
		System.out.println(name.indexOf(name));//0


		String str="good morning hyderbad good evening";
		String str2="good morning hyderbad good evening"; 
		//index		
		System.out.println(str.indexOf('g', 5));
		System.out.println(str.indexOf('m', 7));//imp:default value for the indexof();
		System.out.println(str.indexOf('g', 0));//first occurence of g
		System.out.println(str.indexOf('g', 5));//second occurance of g
		System.out.println(str.indexOf('g', str.indexOf('g', 0)+1));//2nd occerance
		System.out.println(str.indexOf('g',str.indexOf('g', str.indexOf('g', 0)+1)+1 ));
		System.out.println(str.indexOf('g',str.indexOf('g',str.indexOf('g', str.indexOf('g', 0)+1)+1 )+1 ));
		System.out.println(str.indexOf('e', 0));
		System.out.println(str.indexOf('e',str.indexOf('e', 0)+1 ));
		//replace
		String date="26/08/1999";
		System.out.println(date.replace("/", "-"));

		String str1="GOODMORNING HYDERBAD GOOD EVENING";

		//upper case		
		System.out.println(str.toUpperCase());
		//lower case
		System.out.println(str1.toLowerCase());
		//equals 
		System.out.println(str.equals(str));
		System.out.println(str.equals(str1));//false
		
		
		//equalsignorrcase
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring
		System.out.println(str.substring(5));
		//compared to
		System.out.println(str.compareTo(str1));//32 lower and upper 
		System.out.println(str.compareTo(str2));//0 same cases
		
		//contains
		System.out.println(str.contains("morning"));//true
		System.out.println(str.contains("good a"));//false
		
		//trim
		System.out.println(str1.trim());//remove the waste spaces
		
		//splint
 String s[]=str1.split(" ");
 System.out.println(s.length);
 for (int i = 0; i < s.length; i++) {
	 System.out.println(s[i]);
	
}
 //string contacnation
		int x=2000;
		int y=200;
		
		System.out.println(x+y);//2200
		System.out.println(str+x+y);//good......20002006
		System.out.println(x+y+str);//2200 good......
		
		





	}

}
