package b_operator;

public class Ex04_나머지 {

	public static void main(String[] args) {
	
		// 나머지 연산자 활용 : 홀/짝수 구할 때
		int a = 30;
		
		if(a%2==0) { // a를 2로 나누었을 때 나머지가 0과 같으면 - 
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

		//------------------------------
		// 숫자 하나는 입력 받아 해당하는 숫자가 3의 배수인지 여부 출력
		
		if(a%3==0) { // a를 3으로 나누었을 때 나머지가 0과 같으면 - 
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수가 아님");
		}
		
		
		
	}

}
