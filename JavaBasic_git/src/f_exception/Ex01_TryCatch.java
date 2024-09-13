package f_exception;
/*
 * 	오류
 * 		- 에러 : 심각한 오류
 * 		- 예외 : 심각하지 않은 오류 
 * 
 *  예외처리 : 최종적인 목적은 프로그램이 정상으로 종료 
 *  	[1] try ~ catch
 *  	
 *  		try{
 *  			예외가 발새할 여지가 있는 구문
 *  		}catch(Exception ex){
 *  			예외가 발생한 후에 구문
 *  		}finally{
 *  			예외 관련 없이 무조건 실행하는 구문
 *  		}
 *  
 *      [2] 함수 뒤에 throws 로 예외 처리 	
 *      
 * 
 */

public class Ex01_TryCatch {

	public static void main(String[] args) {
		
		// String [] str = new String[] {"안녕하세요", "올라", "하이"};  // new String[] 생략하는 경우 많음
		String [] str = {"안녕하세요", "올라", "하이"};

		try {
			for(int i=0 ; i<=str.length; i++) {  // 문제 발생시 여기에서 끝나고 에러 ("프로그램 종료" 나오지 않음)
												// try~ 구문을 쓰니 예외를 잡아 내고 "프로그램 종료"까지 실행함  
				System.out.println(str[i]);
			}
			// return;  // --> (finally 예시 때 사용) 
		}catch(Exception ex) {
			System.out.println("예외발생 : " + ex.getMessage());
		}finally {  // 정말로 무.조.건 수행하는 구문임. 위에서 return으로 돌려도 이 부분이 실행되며 출력됨.
			System.out.println("무조건 실행 구문");
		}
		
		System.out.println("프로그램 종료");
		
	}

}
