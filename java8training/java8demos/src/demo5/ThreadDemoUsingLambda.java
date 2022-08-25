package demo5;

public class ThreadDemoUsingLambda {
	
	public static void main(String[] args) {
		Runnable target = () -> {
			String threadName = Thread.currentThread().getName();
			for(int i=1; i<=0; i++) {
				System.out.println(threadName+": " +i);
			}
		};
		
		Thread  thread1 = new Thread(target);
		Thread  thread2 = new Thread(target);
		
		thread1.setName("Ranjeet");
		thread2.setName("Ankush");
		
		thread1.start();
		thread2.start();
	}
}
