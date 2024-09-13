package i_access3;

import i_access3.sub.Access;

// Access 클래스와 MainTest 클래스가 동일한 패키지(폴더, 디렉토리) 안에 있는 상황

public class MainTest extends Access{
	// MainTest 자식클래스, Access 부모클래스
	// protected는 다른 패키지에서 자식 클래스의 접근은 허용하므로, 
	// pretected가 있는 Access클래스를 부모로 설정, 현재 페이지 MainTest는 자식으로 설정
	
	public static void main(String[] args) {
		
		MainTest acc = new MainTest(); // ** 객체 이름을 자식 이름으로 변경해야 함 
		// acc.a = "프라이빗 변경"; 
		acc.b = "퍼블릭 변경";
		acc.c = "프로텍티드 변경";  // 다른 패키지에서 자식 클래스는 접근 가능 
		//acc.d ="디폴트 변경";
		
		acc.output();
	}

}
