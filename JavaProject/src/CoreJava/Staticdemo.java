package CoreJava;

public class Staticdemo {
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static String getStr() {
		return str;
	}
	public static void setStr(String str) {
		Staticdemo.str = str;
	}
	private int num= 10; 
	public static String str= "hello this is Java "; 
	public static final String str1="Mumbai"; // we are making string final and that cant be changed 
	
	
	
	public void display ()
	{
		System.out.println("Number is "+num); // i can call class variable in public method 
		System.out.println(str); // i can even call static varible in public method
	}

	public static void show()
	{
		//System.out.println(num);// you cant call public class varibale in static methiod 
		System.out.println(str);
	}
}
