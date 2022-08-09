package collections;

import java.util.ArrayList;

public class Arrayl1 {

	public static void main(String[] args) {

		ArrayList <Integer>array = new ArrayList <Integer>();
		array.add(100);
		array.add(200);
		array.add(300);
		array.add(400);

		ArrayList <String>array1 = new ArrayList <String>();

		array1.add("ramana");
		array1.add("mani");
		array1.add("geetha");
		array1.add("pavan");
		array1.add("surya");
		array1.add("lingam");
		array1.add("shankar");



		System.out.println(array);
		//remove
		//array.remove(3);
		//System.out.println(array); 

		System.out.println(array1);
		//removeAll
		//array1.removeAll();
		//System.out.println(array1);

		ArrayList <String>array2 = new ArrayList <String>();

		array2.add("pavan");
		array2.add("surya");
		array2.add("lingam");
		array2.add("shankar");
		array2.add("geetha");
		System.out.println(array2);
		//contain
		//System.out.println(array2.contains(array1));
		//containAll
		//System.out.println(array1.containsAll(array2));
		//System.out.println(array1.contains("mani"));
		//clear
		//array2.clear();
		//System.out.println(array2);
		//	addAll

		//System.out.println(array2.addAll(array1));
		//System.out.println(array2);
		//System.out.println(array2.removeAll(array1));
		//System.out.println(array2);
		//System.out.println(array2.retainAll(array1));
		//System.out.println(array1.retainAll(array2));

		//System.out.println(array2);
		//System.out.println(array1);
		System.out.println(array.size());

	}

}
