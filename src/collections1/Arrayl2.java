
package collections1;

import java.util.ArrayList;

public class Arrayl2 {


	public static void main(String[] args) {

		ArrayList <Integer> array=new ArrayList <Integer>();
		array.add(100);
		array.add(300);
		array.add(500);

		ArrayList <String> array1 =new ArrayList<String>();
		array1.add("chakri");
		array1.add("mahesh");
		array1.add("niharika");
		array1.add("sudha");
		array1.add("sujatha");
		array1.add("geetha");
		array1.add("seetha");
		array1.add("samhitha");
		
		
		
		System.out.println(array);
		//remove
		//array.remove(1);
		//System.out.println(array);
		
		System.out.println(array1);
		//remove all
		//array1.removeAll(array1);
		//System.out.println(array1);
		
		ArrayList <String> array2=new ArrayList<String>();
		array2.add("geetha");
		array2.add("seetha");
		array2.add("samhitha");
		array2.add("sujatha");
		array2.add("champion");
		System.out.println(array2);
		
		
		//contains
		//System.out.println(array1.contains("sujatha"));
		//contains all
		//System.out.println(array1.containsAll(array2));
		//clear
		//array2.clear();
	System.out.println(array2);
		//addall
		//System.out.println(array2.addAll(array1));//boolean type
		System.out.println(array2);
		//removeall
		//System.out.println(array2.removeAll(array1));//boolean type
		//System.out.println(array2);
		//retains all
		//doubt retain all
		System.out.println(array1.retainAll(array2));//boolean type
		System.out.println(array2);
		System.out.println(array1);
		//size
		System.out.println(array.size());

		
		
		
	}

}
