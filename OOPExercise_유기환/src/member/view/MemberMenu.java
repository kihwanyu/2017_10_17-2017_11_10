package member.view;

public class MemberMenu {
	
	public void mainMenu(){ 
		
		//�޴��� �ݺ� ��µǰ� ��
			//<����ȭ��> 
			System.out.println("========== ȸ�� ���� �޴� ==========");
			System.out.println("1. �ű� ȸ�� ��� ");
			System.out.println("2. ȸ�� ���� �˻� ");
			System.out.println("3. ȸ�� ���� ���� ");
			System.out.println("4. ȸ�� ���� ���� ");
			System.out.println("5. ȸ�� ���� ��� ");
			System.out.println("9. ���� ");
			System.out.println("====================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			
			//- �Էµ� ��ȣ�� ���� MemberManager Ŭ������ �޼ҵ尡 ����ǰ� ��
			//- �˻�, ����, ���� �޴��� ���� �θ޴��� ���� �޼ҵ带 �����ϰ� �� 
			//1�� ���ý� >> MemberManager Ŭ������ insertMember() ���� 	
			//2�� ���ý� >> searchMemberMenu();  
			//3�� ���ý� >> updateMemberMenu();  
			//4�� ���ý� >> deleteMemberMenu();  
			//5�� ���ý� >> MemberManager Ŭ������ printAllMember() ����  
			//9�� ���ý� >> System.out.println("���α׷��� �����մϴ�."); 
	}
	public void searchMemberMenu(){ 
		
		//�޴��� �ݺ� ��µǰ� �� 
		//<����ȭ��> 
			System.out.println("========== ȸ�� ���� �˻� ==========");
			System.out.println("1. ���̵�� �˻��ϱ� ");
			System.out.println("2. �̸����� �˻��ϱ� ");
			System.out.println("3. �̸��Ϸ� �˻��ϱ� ");
			System.out.println("9. ���θ޴��� ");
			System.out.println("====================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			
			//- �Էµ� ��ȣ�� ���� MemberManager Ŭ������ �޼ҵ尡 ����ǰ� ��  
			//1�� ���ý� >> MemberManager�� searchId() ����  
			//2�� ���ý� >> MemberManager�� searchName()����  
			//3�� ���ý� >> MemberManager�� searchEmail()����
			//9�� ���ý� >> System.out.println("���θ޴��� �̵��մϴ�."); 
	}
	public void updateMemberMenu(){ 
		
		//�޴��� �ݺ� ��µǰ� �� 
			//<����ȭ��> 
			System.out.println("========== ȸ�� ���� ���� ==========");
			System.out.println("1. ��й�ȣ �����ϱ� ");
			System.out.println("2. �̸� �����ϱ� ");
			System.out.println("3. �̸��� �����ϱ� ");
			System.out.println("9. ���θ޴���");
			System.out.println("====================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� :");
			//- �Էµ� ��ȣ�� ���� MemberManager Ŭ������ �޼ҵ尡 ����ǰ� ��
			//1�� �Է½� >> MemberManager�� updatePwd() ���� 
			//2�� �Է½� >> MemberManager�� updateName() ���� 
			//3�� �Է½� >> MemberManager�� updateEmail() ����  
	}
	public void deleteMemberMenu(){ 
		//�޴��� �ݺ� ��µǰ� �� 
			//<����ȭ��> 
			System.out.println("=========== ȸ�� ���� ���� ===========");
			System.out.println("1. ȸ�� ���� ");
			System.out.println("2. ��ü ȸ�� ���� ");
			System.out.println("9. ���θ޴��� ");
			System.out.println("======================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			//- �Էµ� ��ȣ�� ���� MemberManager Ŭ������ �޼ҵ尡 ����ǰ� ��  
			//1�� �Է½� >> MemberManager�� deleteOne() 
			//����  2�� �Է½� >> MemberManager�� deleteAll() 
			//����  9�� �Է½� >> System.out.println("���θ޴��� �̵��մϴ�.");
	}
}
