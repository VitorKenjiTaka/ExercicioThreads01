package View;
import Controller.Threadmostranum;

public class Principal {

	public static void main(String[] args) {
		
		for(int threadId = 0 ; threadId < 5 ; threadId++) {
			Thread threadn = new Threadmostranum(threadId);
			threadn.start();
			
		}
	}
}

