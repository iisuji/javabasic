package e_method;

/*
 * call by value
 * 		: 메소드의 인자(파라메터)가 기본형인 경우 (int char 등)
 * 		=> 값만 복사 
 */
public class Ex06_CallByValue {

	public static void main(String[] args) {
		
		int a=10, b=20;
		add(a, b); // 1. 먼저 수행
		System.out.println("2. A=" + a + ", B=" + b);  // 3. 그 다음 출력 
			// (*** 그대로 a=10, b=20 출력, add()에서 가져온 거에 영향받지 않음)
	}

	static void add(int a, int b) {  // 넘어온 애들이 기본형인 경우, call by value
		a += b; // a=a+b;
		System.out.println("1. A=" + a + ", B=" + b);  // 2. 먼저 출력  
	}
	
	
}
