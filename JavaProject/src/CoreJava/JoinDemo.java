package CoreJava;

public class JoinDemo implements Runnable {

	public static int counter = 0; // counter garabage value decided

	// now will take increment and decrement method

	public static int inc() {

		return ++counter;
	}

	public static int dec() {

		return --counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Started Running " + Thread.currentThread().getName()); // currunt
																					// class

		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// call sync method 

	public static void main(String[] args) {

		JoinDemo jd = new JoinDemo();

		// now Declering Thread Object

		Thread td1 = new Thread(jd);
		td1.setName("t1");

		Thread td2 = new Thread(jd);
		td2.setName("t2");
		Thread td3 = new Thread(jd);
		td3.setName("t3");

		try {
			jd.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// now we will use Join method

		td1.start();
		td2.start();
		td3.start();
	}

}
