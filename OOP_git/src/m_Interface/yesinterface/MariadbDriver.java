package m_Interface.yesinterface;

//1. DBDriver 인터페이스 구현 선언
//2. 메소드 오버라이딩

public class MariadbDriver implements DBDriver { // interface를 물려받을 때는 implements 사용

	public MariadbDriver() {
		System.out.println("마리아디비 드라이버 실행");
	}
	
	public void connect() { // 오버라이딩 필수, 메소드명 통일
		System.out.println("마리아디비에 연결 작업");
	}
	
	public void insert() { // 오버라이딩 필수, 메소드명 통일
		System.out.println("마리아디비에 데이타를 입력");
	}
}
