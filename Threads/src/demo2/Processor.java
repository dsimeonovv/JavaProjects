package demo2;

public class Processor extends Thread {
	
	private volatile boolean running = true;
	
	public void run(){
		
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutDown(){
		running = false;
	}
}
