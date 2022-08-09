package multilevelinheritance;

public class Suzuki extends Car {
	String model = " baleno";
	String colour = "blue";
	String cost = "12L";
	String sitting ="4";
	String capacity =" 1500kg";
	String mileage = "20km";
	
	public void cardrive() {
		System.out.println(" car is ready to test drive by customer"); 
	}
	public void selection() {
		System.out.println(" selection  done by the customer");
	}

	
	
	
	
	public static void main(String[] args) {
		Suzuki sz = new Suzuki ();
		
		System.out.println(sz.model);
		System.out.println(sz.colour);
		System.out.println(sz.cost);
		System.out.println( sz.sitting);
		System.out.println(sz.capacity);
		System.out.println(sz.mileage);
       sz.car();
       sz.startengine();
       sz.stoptengine();
       sz.bodyparts();
       sz.bodypartsinstslation();
       sz.cardrive();
       sz.selection();
		
		
		
	}

}
