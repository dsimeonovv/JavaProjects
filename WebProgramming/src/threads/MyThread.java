package threads;

public class MyThread extends Thread {
	private String name;
	private int time;

	public MyThread(String name, int time) {
		this.name = name;
		this.time = time;
	}

	public void run() {
		try {
			while (!isInterrupted()) {
				System.out.println(name);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			
		}
	}
}
