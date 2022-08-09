package oopsconcept;

public class Test1 {

	public static void main(String[] args) {
	
		 Encapsulation nan1 =new  Encapsulation() ;
nan1.setmail("nanikattamuri@ gmail.com");
nan1.setpassword("123456");
System.out.println("my new recovery email id " +nan1.getmailid());
System.out.println("my new password"+ nan1.getpassword());

System.out.println( nan1.getpassword());
System.out.println( nan1.getmailid());

	}

}
