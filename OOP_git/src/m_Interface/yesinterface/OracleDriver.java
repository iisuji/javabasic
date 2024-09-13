package m_Interface.yesinterface;

// 1. DBDriver 인터페이스 구현 선언
// 2. 메소드 오버라이딩

public class OracleDriver implements DBDriver{  // interface를 물려받을 때는 implements 사용 

	public OracleDriver() {
		System.out.println("오라클 드라이버");
	}
	
	public void connect() {  // 오버라이딩, 메소드명 통일 
		System.out.println("오라클 디비에 연결");
	}
	
	public void insert() {  // 오버라이딩, 메소드명 통일
		System.out.println("오라클에 데이타 입력 작업");
	}
}
