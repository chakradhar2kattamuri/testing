package realscenario1;

public abstract class Yokohoma implements Designer {
	public void enginedesign() {
		System.out.println("engine designed successfully");
	}
	public void startengine () {
		System.out.println("engine start successfully");
	}
	public void stopengine() {
	System.out.println("engine stops successfilly");
	}
	public abstract void carpartsdesign();

}
