package threads;

public class ThreadTesting {
	
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread 1", 1000);
		MyThread thread2 = new MyThread("Thread 2", 2000);
		MyThread thread3 = new MyThread("Thread 3", 1500);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
	
}
