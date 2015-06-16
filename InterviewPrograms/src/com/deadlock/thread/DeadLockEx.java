package com.deadlock.thread;

public class DeadLockEx {

	String str1 = "Java";
	String str2 = "Unix";
	
	Thread t1 = new Thread("My Thread 1"){
		public void run(){
			while(true){
				synchronized(str1){
					synchronized (str2) {
						System.out.println();
					}
				}
			}
		}
	};
	
	Thread t2 = new Thread("My Thread 2"){
		public void run(){
			while(true){
				synchronized(str1){
					synchronized (str2) {
						System.out.println();
					}
				}
			}
		}
	};
	
	
	public static void main(String[] args) {
		DeadLockEx dlx = new DeadLockEx();
		dlx.t1.start();
		dlx.t2.start();
		
	}
}
