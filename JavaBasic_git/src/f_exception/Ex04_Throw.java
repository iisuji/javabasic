package f_exception;

public class Ex04_Throw {

	public static void main(String[] args) {
		
		try {
		readMessage();
		}catch(Exception ex) {
			System.out.println("실패 : " + ex.getMessage());
		}
		System.out.println("프로그램 종료");
	}

	static void readMessage() throws Exception { // 예외를 던져주세요 
		String [] str = {"안녕하세요", "올라", "하이"};
		try {
		for(int i=0 ; i<=str.length ; i++) { // 코드에 오류가 있음 (범위 오류)
			System.out.println(str[i]);
		}
		}catch(Exception ex) { // catch 블록 내에서 발생한 예외를 MyException으로 감싸서 호출한 main으로 던짐
			throw new MyException(); // 일부러 예외를 발생시키는 throw (-s붙이지 않음)
									 // 이유 : 개발자가 빨리 보고 싶어서 
		}
	}
		
}
