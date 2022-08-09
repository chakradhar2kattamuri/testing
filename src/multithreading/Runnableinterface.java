package multithreading;
class Runnable1 implements Runnable  {public void run(){
	for (int i = 0; i <= 10; i++) {
		System.out.println("thread1 input"+i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("thread1 input hai");
	System.out.println("thread1 input hai1*&%$#@");
	System.out.println("thread1 input hai25656");
	System.out.println("thread1 input hai3");
}

}
public class Runnableinterface implements Runnable {
	public void run(){
		for (int i = 0; i <= 20; i++) {
			System.out.println("Thread input"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		System.out.println("Thread input hai");
		System.out.println("Thread input hai1111");
		System.out.println("Thread input hai2222");
		System.out.println("Thread input hai333");
	}


	public static void main(String[] args) {
		Runnable1 r1= new Runnable1();
		Runnableinterface r2 = new Runnableinterface();
		Thread  t1= new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}                                                


	
	
	
	
	
	
	
	
	
	
}
		

	


