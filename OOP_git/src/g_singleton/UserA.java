package g_singleton;

public class UserA {

	DBConnect db;
	
	public UserA() { 
		// db = new DBConnect();  ---> 직접적인 인스턴스 생성 방법을 나타내지만, 이는 싱글톤패턴의 목적에 맞지 않으므로 주석처리 
		db = DBConnect.getInstance(); // 위 코드 대신 이 메서드를 호출하여 DBConnect 클래스의 싱글톤 인스턴스를 가져옴, DBConnect의 유일한 인스턴스를 반환
	}
	
	public void use() {
		System.out.println("A 작업");
	}
		
}
