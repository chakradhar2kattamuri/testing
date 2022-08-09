package multilevel_inheritence;

public class Baleno extends Car{
	String model="baleno123";
	String colour="blue";
	int Cost=15;

	public void cardrive() {
		System.out.println("car is ready to test drive");

	}
	public void selection() {
		System.out.println("selection is over by the customer");
	}

	public static void main(String[] args) {
		Baleno sri=new Baleno();
		System.out.println("model of the car is "+sri.model);
		System.out.println("co;our of my car is"+sri.colour);
		System.out.println("cost of my car is"+sri.Cost);
		sri.carengine();
		sri.startengine();
		sri.stopengine();
		sri.bodyparts();
		sri.installation();
		sri.cardrive();
		sri.selection();


	}

}
