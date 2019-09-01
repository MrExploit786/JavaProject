package CoreJava;

public class StaticExcutor {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("calling static method with class name");
		
		Staticdemo.show(); 
		
	Staticdemo.str = "pooja";
	 
	System.out.println("after changing value of static string " +Staticdemo.str);
	
	// but i cant change final string 
	
	// Staticdemo.str1="raj"; // its final string
		// now first i have to object of my class 
		
		Staticdemo sd = new Staticdemo(); 
		
		sd.display(); // calling public method of static demo 
		
		sd.setNum(20);
		
		sd.setStr("Yogesh");
		
		System.out.println("Getting Number ");
		
		System.out.println("Number "+sd.getNum()); // priniting out number 
		
		// chanching name via object name 
		
		System.out.println("String  "+ sd.getStr());
		
		
	}
	
	
	
}
