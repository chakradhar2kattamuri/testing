package multithreading1;

class Threads2 extends Thread {
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("threads2 for input"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Threads2 will allow1 ");
		System.out.println("Threads2 will allow2 ");
		System.out.println("Threads2 will allow3 ");
		System.out.println("Threads2 will allow4 ");
			
			
		
	}
}

public class Threads1 extends Thread {
	public void run() {
		for (int i = 0; i <=20; i++) {
			System.out.println("threads1 for input"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Threads1 will allow4 ");
		System.out.println("Threads1 will allow5 ");
		System.out.println("Threads1 will allow6 ");
		System.out.println("Threads1 will allow7 ");
			
			
		
	}
	

	public static void main(String[] args) {
	Threads2 mc=new Threads2();
	Threads1 mc1=new Threads1();
	//mc.sum();
	mc.start();
	//mc1.sum();
	mc1.start();	

	}

}
