package e_method;

public class Ex03_인자와반환 {

	public static void main(String[] args) {
		// 데이터
		int a=10, b=20;
		int sum = add(a, b);  // int형 a,b를 보낸다 (인자를 보낸다) 
	
		// 결과를 여기에 출력 
		System.out.println("합 : "+sum);
	
	}
	
	static int add(int a, int b) { //void = return값이 없다  //변수형 맞춰주기 int   
								   //a,b 이름 다르게 해줘도 되지만 헷갈리므로 그대로 써줌 
		//데이터 처리
		int sum = a+b;
		return sum; // 반환값을 보낸다 // return sum의 자료형이 int이면 void ---> int로 변경
	
	}

}
