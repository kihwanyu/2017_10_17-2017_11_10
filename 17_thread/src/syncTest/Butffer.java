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
			
			System.out.println("�Һ���:" + data + "�� ��ǰ �Һ��Ͽ����ϴ�.");
			//���� ������ �����ϰ� empty�� true�� �ٲ�
			empty = true;
			//��� ������ �����带 ������·� �ٲ۴�.
			notify();
		}
	}
	public synchronized void setData(int data){
		//���� ���� ������ �����·�, ���� ������ �� ��� ó��
		while(empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		
		System.out.println("������ : " + data + "��ǰ�� �����Ͽ����ϴ�.");
		
		empty = false;
		notify();
	}
}
