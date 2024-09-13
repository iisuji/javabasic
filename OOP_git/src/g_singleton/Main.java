package g_singleton;

public class Main {

	public static void main(String[] args) {
		UserA a = new UserA();
		a.use();
		
		UserB b = new UserB();
		b.use();
		
		UserC c = new UserC();
		c.use();

	}

}

/*

 <싱글톤 패턴 적용 확인>
 
	싱글톤 인스턴스 공유: UserA, UserB, UserC는 모두 생성자에서 DBConnect.getInstance()를 호출하여 
	DBConnect의 싱글톤 인스턴스를 가져옵니다. 따라서 세 클래스 모두 같은 DBConnect 인스턴스를 참조하게 됩니다.

	싱글톤 보장: DBConnect.getInstance() 메서드는 오직 하나의 인스턴스만을 생성하고 반환하므로, 	
	UserA, UserB, UserC의 db 변수는 모두 동일한 DBConnect 인스턴스를 참조합니다.

*/