package a_datatype;

public class Ex05_Declaration {

	public static void main(String[] args) {
		
		/*
		int kor; // "변수선언" 숫자를 저장하는 변수 kor 선언
		kor=30; // "값을 대입" 선언한 변수에 30을 대입 (왼쪽이 공간, 오른쪽이 저장되는 애)
		
		// 초기화 : 변수선언 + 값 대입 동작을 한꺼번에 하는 것 
		int eng=30; // 변수 선언하면서 값 초기화시키기
		*/

		int kor=30, eng=50;  // 변수선언 및 값 초기화 여러개를 한 줄에 모아서 쓸 수 있다. 
		
		// 두 점수 맞바꾸기 --> 두 변수의 값을 바꾸기
		// kor=30, eng=50
		// [바꾼 후] kor=50, eng=30
		int temp=kor; // 값을 바꿀 때 임시 변수 필요  
		kor=eng;
		eng=temp;
		
		System.out.println("국어:"+ kor + " , 영어:" + eng); //println
		System.out.printf("국어:%d, 영어:%d\n", kor, eng);   //printf   // \n : 개행(한 줄 띄어쓰기 기능) 
		System.out.println(); // 행이 하나 더 생기도록 무의미하지만 넣어줌
		
		// 위 두 가지 방법 중에 편한 걸로 사용 가능
	
		/*
		 * 만약에 국어점수와 영어점수가 같은 값이니?
		 * 그렇다면 "두 점수가 동일"이라고 출력
		 * 그렇지 않다면, "두 점수는 다름"이라고 출력
		 */
		if(kor==eng) {
			System.out.println("두 점수가 동일");  // 이 줄만 있다면 두 점수가 동일할 때 출력, 동일하지 않으면 출력하지 않음	
		} else { 
			System.out.println("두 점수가 다름"); // else문까지 적어주면 = 그렇지 않으면, "두 점수가 다름" 출력 
		}
		
		
	}

}
