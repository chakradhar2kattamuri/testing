package constructor;

public class Childcons extends Cons {
	
	public Childcons(){
		super();
		System.out.println("child default constructor");
	}
	public Childcons(int j){
		super(100);
		System.out.println("1 parameter constructor" +j);
	}
	public Childcons(String name){
		System.out.println("1 parameter constructor"+name);
	}
	public static void main(String[] args) {
		 new Childcons();
new Childcons(100000);
new Childcons("nani");

	}

}
