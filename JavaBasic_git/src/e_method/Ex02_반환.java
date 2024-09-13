package e_method;

/*
 *  함수가 끝나기 전에 끝내려고 할 때 (프로그램 제어권 반환) : return 시점에서 끝
 *  
 *  return 할 때 단 하나의 값을 반환 가능 
 *  
 */

public class Ex02_반환 {

	public static void main(String[] args) {
		
		int sum = add(); 
		System.out.println("합=" + sum);   
	}

	static int add() { 
		// void는 아무런 결과 값을 돌려주지 않는, 리턴 타입이 없는 메소드를 만들 때 메소드의 이름 앞에 void라는 키워드를 쓴다.
		// 근데 return을 사용해서 반환하는 애가 생기면 void 자리에 int라고 써줘야 함

		//데이터
		int a=10, b=20;
		int sum = a+b;
		return sum;  //return 할 때는 값을 하나 데리고 갈 수 있다. 이 다음 줄 실행 안 하고 여기에서 리턴!
	}
	
	
}
