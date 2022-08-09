package windowhandling;

public class Reverse {

	public static void main(String[] args) {
		int i=123456;
		int rev=0;
		while (i !=0) {
			rev=rev*10 +i%10;
			i=i/10;
			System.out.println(rev);
			
			
			
			
			}
			String j="mahesh";
	StringBuffer ver=new StringBuffer(String.valueOf(j)).reverse();
	System.out.println(ver);
		}

}


