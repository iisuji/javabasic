package c_control;
/*
 * 
 * 		break : 블럭을 벗어나는 문장
 * 		continue : 블럭의 끝으로 이동하는 문장 
 * 
 * 
 */
public class Ex10_BreakContinue {

	public static void main(String[] args) {

		// break
//		for(int j=0; j<3; j++) {  // j=1이 되는 순간 if 조건을 만족하며 break 되어 블럭을 벗어남 
//			if(j==1) break;
//			System.out.printf("< %d > \n", j);
//		}
//		System.out.println("데이타");
		
		
		// continue
//		for(int j=0; j<3; j++) {  // j=1이 되는 순간 if 조건을 만족하며 
//			if(j==1) continue;    // continue 되어 블럭 끝으로 가서 다시 반복문을 돌림 
//			System.out.printf("< %d > \n", j);  // j=1 값일 때는 결과값 출력을 안 함.
//		}
//		System.out.println("데이타");
		
		
		// break 결과값 생각해보기
//	for( int i=0 ; i<4 ; i++) {
//		
//		for(int j=0; j<3; j++) {  
//		if(j==1) break;    
//		System.out.printf("< %d , %d > \n", i, j);  
//		}
//		System.out.println("데이타");		
//	}	
	
		
		//END 라벨 
//	END: // 안에서 break되었지만 해당 블럭이 아닌 END 라벨 붙어있는 곳을 벗어남 
//	for( int i=0 ; i<2 ; i++) {
//		
//		for(int j=0; j<3; j++) {  
//		if(j==1) break END;  //END = 라벨   
//		System.out.printf("< %d , %d > \n", i, j);  
//		}
//		System.out.println("데이타");		
//	}	
	
	
	//continue 결과값 생각해보기
	for( int i=0 ; i<2 ; i++) {
		
		for(int j=0; j<3; j++) {  
		if(j==1) continue;   
		System.out.printf("< %d , %d > \n", i, j);  
		}
		System.out.println("데이타");		
	}		
	
	
	
		
	}

}
