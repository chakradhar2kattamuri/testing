package realscenorio;

public abstract class Yokohama implements Designer {
	public  void enginedesign() {
		System.out.println("engine designed");
	}
	public  void startengine() {
		System.out.println("engine started sucessfully");
	}
	public  void stopengine() {
		System.out.println("engine stoped sucessfully");
	}
	public abstract void carpartsdesign();
}
