package e_method;

// 안 중요함. call by value와 call by reference 위주로 알아둘 것. 
// 값이 변해야 할 경우, StringBuffer 사용할 것 

public class Ex06_CallByString {

	public static void main(String[] args) {
		String a = "안녕";  // new 안 써도 되는 별종
		String b = "하이";

		add(a, b);
		System.out.println("2. A=" + a + ", B=" + b);  
		 // String은 Call by reference와 달리 별종, 결과값이 add()의 영향을 받지 않는다. 
	}

	static void add(String a, String b ) {
		a+=b; // 연산자도 되는 별종 String
		System.out.println("1. A=" + a + ", B=" + b);
	}
	
	
}
