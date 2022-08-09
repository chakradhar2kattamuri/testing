package realscenario1;

public class Creta extends Yokohoma {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creta cm=new Creta();
cm.cardesign();
cm.enginedesign();
cm.carpartsdesign();
cm.assemblerparts();
cm.cardriver();
cm.startengine();
cm.stopengine();																																
	}

	@Override
	public void cardesign() {
		System.out.println("creta design successfully by designer");

	}

	@Override
	public void assemblerparts() {
		System.out.println("assemble parts successfully");

	}

	@Override
	public void cardriver() {
		System.out.println("car is ready to drive the customer");

	}

	@Override
	public void carpartsdesign() {
		System.out.println("car parts designed successfully");

	}

}
