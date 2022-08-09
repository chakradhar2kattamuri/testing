package multilevel_inheritence;

public class Kia extends Car {
	String model="kia123";
	String colour="blue";
	String Cost="15lakhs";
	public void cardrive() {
		System.out.println("car is ready to test drive");

	}
	public void selection() {
		System.out.println("selection is over by the customer");
	}

	public static void main(String[] args) {
		Kia pam=new Kia();
		System.out.println("model of the car is"+pam.model);
		System.out.println("colour of the car is"+pam.colour);
		System.out.println("cost of the car is"+pam.Cost);
		pam.bodyparts();
		pam.installation();
		pam.startengine();
		pam.stopengine();
		pam.carengine();
		pam.cardrive();
		pam.selection();

	}

}
