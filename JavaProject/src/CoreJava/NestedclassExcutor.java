package CoreJava;

import CoreJava.Outerclass.Inner;
import CoreJava.Outerclass.Staticnner;

@SuppressWarnings("unused")
public class NestedclassExcutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outerclass outer = new Outerclass();

		Inner inner = outer.new Inner(); // calling inner child class with
											// parents
											// class object
		outer.setNum(500);

		System.out.println("outer String " + outer.toString());

		System.out.println("Outer Variable " + outer.getNum());
		
		inner.display();
		
		

	}
}
