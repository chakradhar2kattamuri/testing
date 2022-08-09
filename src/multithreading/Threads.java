package multithreading;
class thread1 extends Thread {public void run(){
	for (int i = 0; i <= 15; i++) {
		System.out.println("thread1 input"+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("thread1 input hai");
	System.out.println("thread1 input hai1");
	System.out.println("thread1 input hai2");
	System.out.println("thread1 input hai3");
}

}
public class Threads extends Thread {
	public void run(){
		for (int i = 0; i <= 25; i++) {
			System.out.println("Thread input"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread input hai");
		System.out.println("Thread input hai1");
		System.out.println("Thread input hai2");
		System.out.println("Thread input hai3");
	}


	public static void main(String[] args) {
		thread1 ob= new thread1();
		Threads ob1 = new Threads();
		//ob.run();
		ob.start();
		//ob1.run();
		ob1.start();
	}                                                
}



