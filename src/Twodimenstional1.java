
public class Twodimenstional1 {

	public static void main(String[] args) {
		
		
		char h [][] =new char[2][3];
		
         h[0][0] ='a';
         h[0][1] ='b';
         h[0][2] ='c';
         h[1][0] ='d';
         h[1][1] ='e';
         h[1][2] ='f';
         System.out.println(h[0][2]);
         System.out.println(h.length);
         System.out.println(h[0].length); 
         for (int i = 0; i < h.length; i++) {
        	 for (int j = 0; j < h[0].length; j++) {
				System.out.println(h[i][j]);
			}
			
		}
         
	}

}
