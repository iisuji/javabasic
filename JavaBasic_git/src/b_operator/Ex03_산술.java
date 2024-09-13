package b_operator;

/*
 * 
 *  산술연산자 : + - * / %
 * 
 * 
 * */


import java.util.*;

public class Ex03_산술 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);   // 입력을 받기 위한 통로를 만들어준다고 생각하자
		System.out.println("첫번째숫자입력->");
		int a=input.nextInt(); //사용자로부터 입력된 정수를 읽어와서 변수 a에 저장
		
		//사용자에게 입력을 요청 
		System.out.println("두번째숫자입력->");
		
		//사용자가 입력한 정수를 읽어온다
		int b=input.nextInt(); // 
	
		//입력받은 정수 출력
		System.out.println("더하기 :" + (a+b));
		System.out.println("빼기 :" + (a-b));
		System.out.println("곱하기 : " + (a*b));
		System.out.println("나누기 : " + (a/b));
		System.out.println("나머지 : " + (a%b));
		
		
	}
}



/*
 * [콘솔창에서 스캐너 클래스 사용하여 나타나게 하기]
 * 
 * 		첫번째 숫자 입력 -> ___ (ex) 20
 * 		두번째 숫자 입력 -> ___ (ex) 15 * 
 * 
 * 		더하기 : 35
 * 		빼기 : 5
 * 		곱하기 : 300
 * 		나누기 : 1 (정수값만 노출됨) 
 * 		나머지 : 5
 * 
 * */