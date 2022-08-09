package multilevelinheritance;

public class Kia extends Car {
	String model = "sonet";
	String colour = "black";
	String cost = "12L";
	String sitting ="7";
	String capacity ="2000kg";
	String mileauge ="30 km";
	
	public void cardrive() {
		System.out.println(" car is ready to test drive by customer"); 
	}
	public void selection() {
		System.out.println(" selection  done by the customer");
	}


	public static void main(String[] args) {

		Kia kia =new Kia();
		System.out.println(kia.model);
		System.out.println( kia.colour);
		System.out.println(kia.cost);
		System.out.println( kia.sitting);
		System.out.println(kia.capacity);
		System.out.println(kia.mileauge);
		kia.car();
		kia.startengine();
		kia.stoptengine();
		kia.bodyparts();
		kia.bodypartsinstslation();
		kia.cardrive();
		kia.selection();
		
	}
	

}
