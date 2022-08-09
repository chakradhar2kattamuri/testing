package constructor1;

public class Childcons extends Cons {

	public Childcons (){
		super();
		System.out.println("default child parameter");

	}
	public Childcons(int i) {
		super(10000);
		System.out.println("one child parameter"+i);
	}

	public Childcons(String name,int i) {
super("Swhizz",200);
		System.out.println("two child parameters"+name  +i);

	}




	public static void main(String[] args) {
		new Childcons();
		new Childcons(100);
		new Childcons("mahesh",500);
	}

}
