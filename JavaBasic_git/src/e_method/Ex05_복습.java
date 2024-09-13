package e_method;

public class Ex05_복습 {

	public static void main(String[] args) {
		int data1 = 1000;
		double data2 = 1.99;
		
		String result = method( data1, data2 );  // 1. method 호출할 때 인자 보내기 
		// 4. 반환값인 msg가 변수 result에 저장됨 
		
		// 5. msg의 값을 출력
		System.out.println(result);
	}

		static String method(int a, double b) {  // int data1, double data2로 적어도 됨 --> 자료형은 무조건 맞춰주기
			// 2. data1과 data2의 값을 여기서 출력
			System.out.println(a);
			System.out.println(b);
			
			String msg = "안녕하세요";
			return msg; // 3. return
		}
}
