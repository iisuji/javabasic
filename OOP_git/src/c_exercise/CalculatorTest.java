package c_exercise;

import java.util.Scanner;

// + : public,  - : private


public class CalculatorTest {

	public static void main(String[] args) {
				
		while(true) {
			// 객체 생성 --> 메모리 저장됨
			CalculatorExpr cal = new CalculatorExpr(); 
			
			Scanner input = new Scanner(System.in);
			System.out.println("첫번째 숫자 -> ");
			// cal.num1=input.nextInt();
			cal.setNum1(input.nextInt());
			System.out.println("두번째 숫자 -> ");
			cal.setNum2(input.nextInt());
			
			// 각 사칙연산 메소드 호출한 결과를 다음 화면에 출력
			System.out.println("추출된 숫자 : " + cal.getNum1() + ", " + cal.getNum2());
			System.out.println("덧셈 : " + cal.getAddition());
			System.out.println("뺄셈 : " + cal.getSubtraction());
			System.out.println("곱셈 : " + cal.getMultiplication());
			System.out.println("나눗셈 : " + cal.getDivision());
			
			// 계속 진행하겠는지 사용자에게 프롬프트하고 계속 하겠다고 하면
			// 숫자 2개를 입력 받아 이미 생성된 CaculatorExpr 객체에 설정하고
			// 각 사칙연산 메서드를 호출하여 출력 
			
			System.out.println("종료할까요?(Y/N)");
			String answer = input.next();
			if(answer.equals("Y") || answer.equals("y")) break;
			
		}
			
	}

}
