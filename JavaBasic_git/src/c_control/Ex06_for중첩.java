package c_control;

public class Ex06_for중첩 {

	public static void main(String[] args) {
		
//	for(int j=0; j<5; j++) {  // (5줄)
//		for(int i=0; i<5 ; i++) {  // (5칸) 조건을 만족할 때 *를 출력 ~ i<5 까지 
//			System.out.print('*');   // print()를 사용하여 개행 안 되도록 함 
//		}
//		System.out.println();
//	}
		
		/*
		 * 
		 * 외부 루프는 j의 값을 0~4까지 증가시키며 각 반복에서 내부 루프를 호출합니다.
		 * 내부 루프는 현재 j의 값에 따라 i를 반복하며 별을 출력합니다.
		 * 내부 루프가 끝나면 외부 루프가 다음 반복을 시작하고, 이 과정이 5번 반복되어 다섯 개의 줄이 출력됩니다. 
		 *
		 */
		
		
	// 별표가 줄마다 하나씩 늘어남	
	for(int j=0; j<5; j++) {  // 5줄 _ 외부 for 루프는 j의 값을 0부터 4까지 순회, 5번 반복, 각반복에서 새로운 줄 생성 
		                      // ex) j가 0일 때 내부 루프를 실행
		for(int i=0; i<j+1 ; i++) {  // 내부 for 루프는 i의 값을 0부터 j까지 순회. 이 루프는 현재 j의 값에 따라 i의 값만큼 반복
			System.out.print('*');   // print()를 사용하여 개행하지 않고 계속 같은 줄에 별을 추가 
		}
		System.out.println(); // 내부 루프가 끝나면 prinln()을 호출하여 개행을 수행. 이로 인해 별을 출력한 후 새로운 줄로 넘어가게 됨
	}	

	// 별표가 줄마다 하나씩 줄어듦
//	for(int j=0; j<5; j++) {  // 5줄
//		for(int i=0; i<5-j ; i++) {  // 5칸
//			System.out.print('*');   // print()를 사용하여 개행 안 되도록 
//		}
//		System.out.println();
//	}
	
		
		
		// 별표가 줄마다 앞 공백이 늘어남 
		for(int j=0; j<5; j++) {// 5줄
			
			// 공백출력
			for(int i=0 ; i<j ; i++ ) {  
				System.out.print(" ");  // print() 사용하여 옆으로 공백 생기도록 할 것
			}
			
			// '*' 찍기
			for(int i=0; i<5-j ; i++) {  // 5칸
				System.out.print('*');   // print()를 사용하여 개행 안 되도록 
			} 
			System.out.println();
		}	
		
				
	} //end of main
} // end of class
