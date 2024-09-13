package i_access2;

import i_access2.sub.Access;

// Access 클래스와 MainTest 클래스가 동일한 패키지(폴더, 디렉토리) 안에 있는 상황

public class MainTest {

	public static void main(String[] args) {
		
		Access acc = new Access();
		// acc.a = "프라이빗 변경";  ---> 에러 : private이라 접근 불가 
		acc.b = "퍼블릭 변경";
		//acc.c = "프로텍티드 변경";
		//acc.d ="디폴트 변경";
		
		acc.output();
	}

}
