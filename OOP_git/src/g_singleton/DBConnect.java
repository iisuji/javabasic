package g_singleton;

/*
 *  Singleton pattern 
 *  메모리에 단 하나만 올라가도록 하는 것 
 *  
 *  - 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다. 
 *  
 */

/*
 * 주어진 코드에서는 싱글톤 패턴을 사용하여 DBConnect 클래스의 인스턴스를 하나만 생성하도록 구현하고 있다. 
 *  
 */


public class DBConnect {

	// 생성자 접근 제한 : 클래스 외부에서 인스턴스를 생성하지 못하도록 함. 이렇게 하면 클래스 내부에서만 인스턴스를 만들 수 있음. 
	private DBConnect() { 
		System.out.println("실제 디비에 연결함");
	}
	
	// 유일한 인스턴스 저장 
	// dbconn이라는 static 변수를 선언하여 클래스의 유일한 인스턴스를 저장
	// static 변수는 클래스가 로드될 때 메모리에 한 번만 할당되며, 클래스의 모든 인스턴스에서 공유됨. 
	private static DBConnect dbconn = null;
	
	// 인스턴스 접근 메서드 
	// dbconn이 null일 때만 새로 인스턴스를 생성하고, 이후에는 이미 생성된 인스턴스를 반환하기 때문에 인스턴스가 하나만 생성되게 됨. 
	public static DBConnect getInstance() {
		if(dbconn == null) 
		dbconn = new DBConnect();  // 객체를 만든다 
		return dbconn;	
	}
	
	/*
	getInstance 메서드가 처음 호출될 때 dbconn이 null이므로 DBConnect의 인스턴스가 생성됩니다. 
	이후 dbconn 변수에 할당된 인스턴스가 반환되므로, 두 번째 호출부터는 새 인스턴스가 아닌 이미 생성된 인스턴스가 반환됩니다.
	
	dbconn은 static 변수이기 때문에 클래스가 로드된 후부터는 클래스의 모든 인스턴스가 dbconn을 공유합니다. 
	따라서 dbconn이 참조하는 인스턴스는 오직 하나만 존재하게 됩니다. 
	
	*/
	
}
