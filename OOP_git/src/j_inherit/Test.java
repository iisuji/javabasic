package j_inherit;

public class Test {

	public static void main(String[] args) {
		
		Umma u = new Umma();
		 u.gene();
		 u.job();
	
		Ddal d = new Ddal();  // 엄마 객체가 먼저 생성된 후 딸의 객체가 생성된다. 
							  // 메모리에 이미 엄마와 딸의 데이터들이 들어가 있는 것, console출력 생성자함수 내용 확인
		 d.gene();
		 d.study();
		 d.job(); // 자식클래스는 부모 멤버 사용 가능(호출 가능) => 출력 : 엄마는 대장 
	
	
		
		// ********************
		// 변수는 부모 클래스이고, 객체는 자식 클래스 
//		Umma dal = new Ddal(); // 메모리에는 엄마, 딸 메모리가 모두 잡혀있으나, dal은 엄마 것만 참조함
//		dal.job();
//		// dal.study(); // 에러 : dal은 딸만 가지고 있는 메소드는 참조하지 못함
//		dal.gene(); // **부모와 동일한 메소드 가지고 있을 경우 자식의 오버라이딩 함수 호출 
	
		
		//********** casting
		// 참조형에서 부모자식간에 캐스팅
		
//		[아래 경우는 아님]
//			String a = new String();
//			StringBuffer b = (StringBuffer)a;
//		
		
		// 부모 자식간에 캐스팅 가능 
//		Umma a = new Umma();
//		Ddal d = (Ddal)a;
		
//		Ddal d = new Ddal();
//		Umma a = (Umma)d;  // up casting  // 엄마를 가리키지만 사실을 딸을 형변환 한 것		
//		Ddal d2 = (Ddal)a; // down casting

		
		// 연산자 : instanceof
//		Ddal d = new Ddal();
//		
//		if(d instanceof Ddal) { // d는 딸의 객체가 맞는지 
//			System.out.println("Ddal 클래스 객체");
//		}
//		
//		if(d instanceof Umma) {  // d는 엄마의 객체가 맞니
//			System.out.println("Umma 클래스 객체"); 
//		} // 결과 : d는 딸의 변수이지만 엄마의 자식이므로 결과가 에러 없이 뜬다. 
	
		
	}

}
