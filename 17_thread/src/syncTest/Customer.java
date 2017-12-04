package syncTest;

import java.nio.Buffer;

public class Customer extends Thread{
	private Buffer criticalData;
	
	public Customer(Buffer buffer){
		this.criticalData = buffer;
	}
	@Override
	public void run(){
		for(int i = 1; i <= 10; i++){
			criticalData.getData();
			
		}
	}
}
