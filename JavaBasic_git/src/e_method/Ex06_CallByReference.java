package e_method;
/*
 * ( Ex06_call by value 다음 )
 * 
 *	call by Reference
 * 		: 메소드의 인자(파라메터)의 자료형이 참조형인 경우 (string 등)
 * 		=> 주소만 복사 (메모리에는 하나가 잡혀 있고, 그 메모리 주소로 main, add에서 모두 찾아갈 수 있다. 
 */
public class Ex06_CallByReference {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a, b);
		System.out.println("2. A=" + a + ", B=" + b); // add() 거친 후 출력값에 영향을 미침
	}

	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);  // 참조형은 연산 못 씀
		System.out.println("1. A=" + a + ", B=" + b);
	
	}
	
	
}
