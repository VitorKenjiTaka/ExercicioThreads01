package Controller;

public class Threadmostranum extends Thread{
	private int threadId;
	
	public Threadmostranum(int threadId) {
		this.threadId = threadId;	
	}
	@Override
	public void run() {
		
		System.out.println(threadId);	
		
	}
}