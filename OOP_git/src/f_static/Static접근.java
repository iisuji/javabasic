package f_static;

//static이 붙었다? ---> 클래스명으로 객체 생성 없이 직접 접근해도 됨 

public class Static접근 {

	static String name = "홍길동";  // static 메인 함수와 함께 실행하기 위해 static을 붙여준다.  
	
	public static void main(String[] args) {  // 먼저 실행할 수 있도록 static이 메모리 확보해놓음 
											  // static 붙은 애들은 static 붙은 애들끼리?						
		System.out.println("고객명: " + name);

	}

}
