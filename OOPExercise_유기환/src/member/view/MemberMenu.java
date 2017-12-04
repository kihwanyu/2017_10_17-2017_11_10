package member.view;

public class MemberMenu {
	
	public void mainMenu(){ 
		
		//메뉴는 반복 출력되게 함
			//<실행화면> 
			System.out.println("========== 회원 관리 메뉴 ==========");
			System.out.println("1. 신규 회원 등록 ");
			System.out.println("2. 회원 정보 검색 ");
			System.out.println("3. 회원 정보 수정 ");
			System.out.println("4. 회원 정보 삭제 ");
			System.out.println("5. 회원 정보 출력 ");
			System.out.println("9. 종료 ");
			System.out.println("====================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			
			//- 입력된 번호에 따라 MemberManager 클래스의 메소드가 실행되게 함
			//- 검색, 수정, 삭제 메뉴는 각각 부메뉴에 대한 메소드를 실행하게 함 
			//1번 선택시 >> MemberManager 클래스의 insertMember() 실행 	
			//2번 선택시 >> searchMemberMenu();  
			//3번 선택시 >> updateMemberMenu();  
			//4번 선택시 >> deleteMemberMenu();  
			//5번 선택시 >> MemberManager 클래스의 printAllMember() 실행  
			//9번 선택시 >> System.out.println("프로그램을 종료합니다."); 
	}
	public void searchMemberMenu(){ 
		
		//메뉴는 반복 출력되게 함 
		//<실행화면> 
			System.out.println("========== 회원 정보 검색 ==========");
			System.out.println("1. 아이디로 검색하기 ");
			System.out.println("2. 이름으로 검색하기 ");
			System.out.println("3. 이메일로 검색하기 ");
			System.out.println("9. 메인메뉴로 ");
			System.out.println("====================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			
			//- 입력된 번호에 따라 MemberManager 클래스의 메소드가 실행되게 함  
			//1번 선택시 >> MemberManager의 searchId() 실행  
			//2번 선택시 >> MemberManager의 searchName()실행  
			//3번 선택시 >> MemberManager의 searchEmail()실행
			//9번 선택시 >> System.out.println("메인메뉴로 이동합니다."); 
	}
	public void updateMemberMenu(){ 
		
		//메뉴는 반복 출력되게 함 
			//<실행화면> 
			System.out.println("========== 회원 정보 수정 ==========");
			System.out.println("1. 비밀번호 수정하기 ");
			System.out.println("2. 이름 수정하기 ");
			System.out.println("3. 이메일 수정하기 ");
			System.out.println("9. 메인메뉴로");
			System.out.println("====================================");
			System.out.print("메뉴 번호를 입력하세요 :");
			//- 입력된 번호에 따라 MemberManager 클래스의 메소드가 실행되게 함
			//1번 입력시 >> MemberManager의 updatePwd() 실행 
			//2번 입력시 >> MemberManager의 updateName() 실행 
			//3번 입력시 >> MemberManager의 updateEmail() 실행  
	}
	public void deleteMemberMenu(){ 
		//메뉴는 반복 출력되게 함 
			//<실행화면> 
			System.out.println("=========== 회원 정보 삭제 ===========");
			System.out.println("1. 회원 삭제 ");
			System.out.println("2. 전체 회원 삭제 ");
			System.out.println("9. 메인메뉴로 ");
			System.out.println("======================================");
			System.out.print("메뉴 번호를 입력하세요 : ");
			//- 입력된 번호에 따라 MemberManager 클래스의 메소드가 실행되게 함  
			//1번 입력시 >> MemberManager의 deleteOne() 
			//실행  2번 입력시 >> MemberManager의 deleteAll() 
			//실행  9번 입력시 >> System.out.println("메인메뉴로 이동합니다.");
	}
}
