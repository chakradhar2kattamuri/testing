package oopsconcept;

public class Encapsulation {

	
		// Encapsulation is a technique of making the fields in a class private and providing access
		//to the fields via  public methods
		
		private String username;
		private String  password;
		
		public void setmail(String uname) {
			username = uname;
			
			
		}
		public String  getmailid() {
			return  username;
		}
		public void setpassword( String pasword) {
			password = pasword;
		}
	public String getpassword () {
		return password;
		
	}

}
