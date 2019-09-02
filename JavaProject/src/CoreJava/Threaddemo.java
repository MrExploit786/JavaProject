package CoreJava;

public class Threaddemo extends Thread {
	
	public void run() {
		
		System.out.println("String name "+this.getName());
		 
		
		try {
			Thread.sleep(500); // therad sleep time 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		State st = this.getState();
		
		System.out.println("state is "+st.name());
 
		
	}
	
	
	public static void main(String[] args) {
		
		Thread td = new Thread();
		
		td.setName("Thread 1");
		
		td.setPriority(MAX_PRIORITY);
		
		td.setDaemon(true);
		
		
		td.start();
		
		System.out.println("Running Thread is "+td.getName());
		
		System.out.println("check priority  "+td.getPriority());
		
		System.out.println("Alive Status  "+td.isAlive());
		
		System.out.println("Check Demon "+td.isDaemon()); 
		
		System.out.println("Count "+Thread.activeCount());
	}
	
}
