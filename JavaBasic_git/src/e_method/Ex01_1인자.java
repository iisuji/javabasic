package e_method;

/*
 * 인자 - argument
 * 매개변수 - parameter
 *
 * 인자 : = 매개변수 (원래는 다른 것인데, 요즘은 섞어서 함께 이야기하곤 함) 
 * 
 */


public class Ex01_1인자 {

	public static void main(String[] args) {
		// 데이터
		int a = 10, b=20;
		add(a, b); // 데이터 보내는 애 - 인자 : argument 
		
	}

	static void add(int a, int b) {  // 받는 애 - 매개변수 : parameter
		// 데이터에 대한 처리
		int sum = a + b;
		System.out.println("합 : " + sum);
	}
	
	
}
