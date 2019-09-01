package CoreJava;

public class Calculator implements Staticdemo1,Staticdemo2 {

	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
	
		
		System.out.println("multiply  ="+a*b);
		
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Divide  ="+a/b);
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition  ="+a+b);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		//System.out.println("substraction  ="+a-b);
		
	}

}
