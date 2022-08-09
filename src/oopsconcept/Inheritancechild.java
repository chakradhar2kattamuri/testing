package oopsconcept;

public class Inheritancechild extends Inheritanceparent {
	
	public void categorylist() {
		System.out.println("catogories added sucessfully");
	}
 public void sendbulkmessage() {
	 System.out.println(" sendbulkmessage sucessfully");
 }
	
	public static void main(String[] args) {
		Inheritancechild h =new Inheritancechild();
		
				System.out.println(h.a);
		
		System.out.println( h.name);
		h.login();
		h.courses();
		//h.categorylist();
		//h.sendbulkmessage();

	}

}

