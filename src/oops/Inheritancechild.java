package oops;

public class Inheritancechild extends Inheritanceparent {
	public void image() {
		
		System.out.println("image added successfully");
		System.out.println("image changed successfully");
		
	}
	public void sendmessage() {
		System.out.println("send message successfully");
		
	}

	public static void main(String[] args) {
		Inheritancechild sun=new Inheritancechild();
		System.out.println(sun.a);
		System.out.println(sun.appname);
		sun.login();
		sun.settings();
		sun.image();
		sun.sendmessage();

	}

}

