package syncTest;

import java.nio.Buffer;

public class Producer extends Thread {
	private Buffer criticalData;
	
	public Producer(Buffer buffer){
		this.criticalData = buffer;
	}
	@Override
	public void run(){
		
	}
}
