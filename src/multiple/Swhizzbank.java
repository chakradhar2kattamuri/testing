package multiple;

public class Swhizzbank implements Sbi,Hdfc,Icici {

	public static void main(String[] args) {
	 Swhizzbank s=new Swhizzbank();
	 

	}
public void fixedeposit() {
	System.out.println("fixed deposit successfully");
	
}


public void withdraw() {
	System.out.println("withdraw successfully");
	
}

@Override
public void accountopen() {
	System.out.println("accountopen successfull");
	
}

@Override
public void netbanking() {
	System.out.println("netbanking");
	
}

@Override
public void personalloan() {
System.out.println("personal loan successfully");
	


	}
@Override
public void atm() {
	// TODO Auto-generated method stub
	
}
@Override
public void smartpending() {
	// TODO Auto-generated method stub
	
}

}
