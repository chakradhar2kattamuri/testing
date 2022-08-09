package collections1;

import java.util.LinkedList;

public class Linkedli2 {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList <Integer>();
		list.add(500);
		list.add(700);
		list.add(900);
		System.out.println(list);

		LinkedList<Integer>list1=new LinkedList <Integer>();
		list1.add(800);
		list1.add(1000);
		list1.add(900);
		System.out.println(list1);
		//addall
		System.out.println(list1.addAll(list));
		System.out.println(list1);
		//get
		System.out.println(list.get(2));
		//remove
		System.out.println(list1.remove(1));
		//set
		System.out.println(list.set(1, 2));
		System.out.println(list.set(0, 2));
		//iterator
		System.out.println(list1.iterator());
	}

}
