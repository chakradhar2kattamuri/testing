

public class Allclasses {
	static int x=250;
	static int y=250;


	public static void main(String[] args) {

		int a=125;
		int b=145;
		int c=240;
		String str=("sowmi is a axis bank employee");
		char d='5';

		//public variable
		//static variable
		//sum method

		System.out.println("addition of a and b" + (a+b));
		System.out.println("subtraction of b and c" + (b-c));
		System.out.println("dividion of c and a" + (c/a));
		System.out.println("multiplication of a and c" + (a*c));
		System.out.println(str);
		System.out.println(x+y); 
		Allclasses obj= new Allclasses ();
		obj.display();




		//static method
		String name="mahesh";
		String name1="sowmya";
		boolean bb=(a<=b);
		boolean bb1=(a>=b);




		System.out.println(a<b);
		System.out.println(b<a);
		System.out.println(++a);
		System.out.println();
		System.out.println(bb1);
		System.out.println(bb);
		System.out.println(name+name1);

		//conditions (if, if else, nexted if, switch)
		//loops (while ,do while ,for)



		int z=22;
		int q=143;
		int i=896;

		if (z<=q & z>=q ) {


			System.out.println("q holds the greter value of z");




		}
		if (z<=q &z>=q) {
			System.out.println("q is holds the greater than z");


		} else {
			System.out.println("z holds the gretaer value of q ");


		}

		if (z>=q & z>=i) {
			System.out.println("z holds the greter value of q");

		} else if (z<=i)  {
			System.out.println("i holds the greter value of z");


		}
		else {
			System.out.println("z holds the greter value of i");



		}
		String course ="automation";
		
	switch (course) {
	case ("devops"):
		System.out.println("devops course is avialable");
	break;
	case ("manual"):
		System.out.println("manual course is availablke");
	break;
	case ("automation"):
		System.out.println("automation course is available");
	}
	// loops (while,do while ,for)
	
	
	System.out.println("out of the  while loop");
	int j=1;
	
	while (j<=10) {
		System.out.println("mahesh world" + j );
		j=j+1;
			
	}
	System.out.println("out of the do while loop");
	int s=1;
	
	do{
		
		System.out.println("mahesh world " + s);
		s=s+1;
	} while (s<=10);
	
		System.out.println("out of for loop");
 for (int l=1; l<=10 ;l=l+1) {
	 System.out.println("mahesh world "+ l);
	 
	 
	 
 }
	 
 }










	public void display () {

		int k=1542;
		int m=32548;
		char v='b';
		System.out.println(k+m);

		//arthematics operations (+,-,*,/,%)
		//relational operators  (<,>,<=,>=,++,--,**,//,!=)






	}

}
