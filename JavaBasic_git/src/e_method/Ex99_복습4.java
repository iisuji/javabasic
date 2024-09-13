package e_method;

public class Ex99_복습4 {

	public static void main(String[] args) {
		
		/*
		 * 1. 정수형 데이터(int) 2개를 매개변수로 받아서 뺄셈 연산을 수행하여
		 * 	  "결과값을 반환하는" subtract 메소드를 선언하고, 
		 * 	  입력 받은 두 수를 인자로 보내서 그 메소드를 호출하여 결과값을 출력하는 프로그램을 작성하시오.
		 * 	  (함수의 뼈다귀만 만들어주세용)
		 * 
		 * 2. 정수형 데이터 1개를 매개변수로 받아서 해당되는 문자열(인사말)을 모니터로 출력하는 메소드 greeting를 선언하고,
		 * 	 입력 받은 정수형 데이터를 인자로 보내서 그 메소드를 호출합니다.
			 단, 그 정수 데이터에 따라 다음과 같은 인사말을 출력합니다.
			 ( 1-안녕하세요, 2-굿모닝, 3-올라, 4-곤니치와 )
		 * 
		 * 3. 반복 출력할 횟수를 매개변수로 받아서 “자바는 맛있다”라는 문장을 반복하여 출력하는
		 *    loopMethod 메소드를 선언하고,
		 * 	  입력 받아 수를 인자로 그 메소드를 호출하는 프로그램을 작성하세요.
		 * 
		 * 4 실수형 데이터 1개를 매개변수로 받아서 원의 넓이를 계산한 결과값을 반환하는 circle 메소드을 선언하고,
		 *   입력 받은 실수형 데이터를 인자로 넘겨 그 메소드를 호출하여 반환되는 결과를 출력하는 프로그램을 작성하세요.
		 *   단, 음수 데이터는 입력할 수 없습니다.
		 * 
		 * 5. 정수형 데이터 2개를 매개변수로 받아서 사각형의 넓이를 계산한 결과값을 반환하는 square 메소드를 선언하고,
		 *    입력 받은 두 정수 데이터를 인자로 넘겨 그 메소드를 호출하여 반환값을 출력하는 프로그램을 작성하세요.
		 *    단, 음수 데이터는 입력할 수 없습니다.
		 *
		 * 
		 */
		
//		int result = subtract(4, 2);
//		System.out.println(result);
		
		greeting(2);
		loopMethod(3);
		
		double extent=circle(3.5);
		System.out.println("원의 넓이 : " + extent);
		
		int extent = square(5, 6);
		System.out.println("사각형 넓이 : "+extent);
		
	}
	
	// 1번
	static int subtract(int a, int b) {
		int result = a - b; 
		return result; 
	}
	
	// 2번
	static void greeting(int a) {  // 결과값을 반환하라는 말이 없으므로, return (x) / void로 써준다   
		String insa = "";
		switch(a) {
		case 1 : insa = "안녕하세요"; break; 
		case 2 : insa = "굿모닝"; break;
		case 3 : insa = "올라"; break;
		case 4 : insa = "곤니치와"; break;
		}
		System.out.println("인사:" + insa);
	}
	
	// 3번
	static void loopMethod(int a) {
		for(int i=0 ; i<a ; i++) {
			System.out.println("자바는 맛있다");
		}
	}
	
	// 4번
	static double circle(double a) {
		double extent =0;
		extent = a*a*3.14;
		
		return extent;
	}
	
	// 5번
	static int square(int a, int b) {
		int extent = 0;
		extent = a*b;
		
		return extent; 
	} 
	
}
