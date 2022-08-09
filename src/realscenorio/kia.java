package realscenorio;

public class kia extends Yokohama {

	public static void main(String[] args) {
		kia ca = new kia();
ca.cardesign();
ca.enginedesign();
ca.carpartsdesign();
ca.assembleparts();
ca.cardriver();
ca.startengine();
ca.stopengine();
	}

	@Override
	public void cardesign() {
		System.out.println("kia car designed successfully");
		
	}

	@Override
	public void assembleparts() {
		System.out.println("assemble parts successsfully");
		
	}

	@Override
	public void cardriver() {
		System.out.println("car is ready to drive on road");
		
	}

	@Override
	public void carpartsdesign() {
		System.out.println("car parts  designed successsfully");
		
	}

}
