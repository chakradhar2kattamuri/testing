package multithreading1;
class Runnableinterface2 implements Runnable {
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println("interface output"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("interface2 will come1");
		System.out.println("interface2 will come2");
		System.out.println("interface2 will come3");
		System.out.println("interface2 will come4");
	}
}

public class Runnableinterface1 implements Runnable {
	public void run() {
		for (int i = 0; i <=20; i++) {
			System.out.println("interface input"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("interface1 will come5");
		System.out.println("interface1 will come6");
		System.out.println("interface1 will come7");
		System.out.println("interface1 will come8"); 
	}
public static void main (String []args) {
	Runnableinterface2 gm=new Runnableinterface2();
	Runnableinterface1 gm1=new Runnableinterface1();
	Thread t1=new Thread(gm);
	Thread t2=new Thread(gm1);
	
	t1.start();
	t2.start();
	
}
} 
