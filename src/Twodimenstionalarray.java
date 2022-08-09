
public class Twodimenstionalarray {

	public static void main(String[] args) {
		// two dimensional array
		
		
		char i[][] =new char[2][3];
		
		i[0][0] = 'A';
		i[0][1]= 'B';
		i[0][2] ='C';
		i[1][0]='g';
		i[1][1] ='h';
		i[1][2]='i';
		System.out.println(i[0][0]);
		System.out.println(i.length);
		System.out.println(i[0].length);
		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < i[0].length; j2++) {
				System.out.println(i[j][j2]);
			}
			
			String s [][] =new String[2][3];
			s[0][0] ="chakri";
			s[0][1] ="mahesh";
			s[0][2] ="pr";
			s[1][0] = "lakshman";
			s[1][1] ="hayath";
			s[1][2] ="bava";
	System.out.println(s[0][0]);
	System.out.println(s.length);
	System.out.println(s[0]. length);
	for (int x = 0; j < s.length; j++) {
		for (int x2 = 0; x2 < s[0].length; x2++) {
			System.out.println(s[x][x2]);
			
		}
				

	}
	
}
		
		
	}

}
