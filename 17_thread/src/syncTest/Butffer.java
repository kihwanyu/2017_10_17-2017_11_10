package syncTest;

public class Butffer {
	private int data;
	private boolean empty = true;
	
	public synchronized void getData(){
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			System.out.println("소비자:" + data + "번 상품 소비하였습니다.");
			//값이 있으면 리턴하고 empty는 true로 바꿈
			empty = true;
			//대기 상태의 스레드를 실행상태로 바꾼다.
			notify();
		}
	}
	public synchronized void setData(int data){
		//현재 값이 있으면 대기상태로, 값이 없으면 값 기록 처리
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		
		System.out.println("생산자 : " + data + "상품을 생산하였습니다.");
		
		empty = false;
		notify();
	}
}
