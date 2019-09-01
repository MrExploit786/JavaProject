package CoreJava;

public class Outerclass {
	private int num=10;
	private static final String str="This is Yogesh";
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static String getStr() {
		return str;
	}
	
	public class Inner{
		
		public void display()
		{
			System.out.println(" From outerclass variable in Innerclass   "+  num);
			System.out.println(" From outerclass static variable in Innerclass"+  str); // i can call static variable in nested class 
			
		}
		}
		
		
		public static class Staticnner{
			
			int rollnumber=202;
			public static void Show (){
				
				System.out.println("from Staticinner"+str);
			}
			
			
		}
		
		
	
	

}
