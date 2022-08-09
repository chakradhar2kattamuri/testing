
public class Conditionsstatements {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=60;
		int c =80;
		 System.out.println("hellon test");
		 
		 if (b>a &c>b) {
			 System.out.println("b holds greater value than a");
				
		 }
				
		 System.out.println("hello test 1");
		 if (a>b & c>a ) {
			 System.out.println("a holds greater value than b"); 
				
		 } else {
			 System.out.println("b holds greater value than a");
		 }
		 if (b>a &c>b) {
			 System.out.println("c is holding greater value than b and c");
				
		 } else if (a>b){
			 System.out.println("a is holding greater value than  b");
		 	
		 }
		 else {
			 System.out.println("b is greater than c ");
		 }
		//if is used for only one statement	
		 //if else used for print any condition
		// nextif used for two or more conditions
		 
		 
		 
		 //swithc is used for compare one condition  with multiple statement
		 
		 String  course = "java";
		 switch(course) {
		 case"testing":
			 System.out.println("testing course is available");
			 break;
		 
		 case"salesforce":
			 System.out.println("salesforce course is available");
			 break;
			 
		 case"java":
			 System.out.println("java course is available");
			 break; 
		 


		 }
		 
		 
	}

}
