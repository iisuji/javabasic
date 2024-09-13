package m_Interface.yesinterface;

public class MainTest {

	public static void main(String[] args) {
		
		// 1. 오라클 디비에 연결하고 사용한다면?
		//DBDriver driver = new OracleDriver();  // DBDriver 인터페이스명으로 변경해줌  - Oracle
		DBDriver driver = new MariadbDriver();  // DBDriver 인터페이스명으로 변경해줌 - Mariadb
		
		driver.connect();
		driver.insert();
		
		// 2. 오라클 디비에서 마리아 디비로 변경한다면?
		  // --- 위쪽 코드만 써주면 해결~! 
	}

}
