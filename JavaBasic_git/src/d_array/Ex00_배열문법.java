package d_array;

public class Ex00_배열문법 {

	public static void main(String[] args) {
		
		// 배열 변수 선언
		int [] kor = null; 	// 배열의 초기화 값은 null로 준다  // 배열 변수의 공간만 만들어 놓은 것

		// 배열 객체 생성
		kor = new int[3];  // 반.드.시 new와 함께 사용
				
		// 값 지정
		kor[0] = 100;
		kor[1] = 200;
		kor[2] = 300;

		
		// 배열 변수 선언 + 객체생성
		int[] kor = new int[3];
		
		// 값 지정
		kor[0] = 100;
		kor[1] = 200;
		kor[2] = 300;
		
		//초기화
		//배열변수 선언 + 객체 생성 + 값지정
		//int[]kor = new int[] {100,200,300};
		int [] kor = {100,200,300};   //초기화 이렇게 줄여서 사용 가능 
		
		
		// 총점 구하기
		int total = 0;  // 총점을 저장할 변수를 초기화 
		for(int i=0 ; i<kor.length ; i++ ) {  // 개수를 직접 지정해주면 실수할 수 있으므로, 배열에서는 length로 처리해서 식을 써준다
			total += kor[i];  // 배열의 각 요소를 total에 누적한다. 
		}
		System.out.println("총점 : " + total);
	}

}
