package e_method;

public class Ex00_흐름 {

	static void method() {   //static을 붙여줘야 함 
		System.out.println("method 실행");  // 3. method 실행  // 5. method() 실행 // 7. method() 실행
	}
	
	public static void main(String[] args) {  // 1. JVM은 항상 main 부터 시작한다. 
		
		System.out.println("main 시작");
		method();  // 2. method() 부름
		method();  // 4. method() 부름
		method();  // 6. method() 부름
		
		System.out.println("main 끝"); // 8. main 끝 
	}
	
}
