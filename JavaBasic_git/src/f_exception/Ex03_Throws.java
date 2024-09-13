package f_exception;

import java.io.FileInputStream;

public class Ex03_Throws {

		public static void main(String[] args) {
			
			try {
				readFile();  // 예외를 여기로 던짐, try ~ catch 써줌 
				System.out.println("파일처리성공");
			}catch(Exception ex) {
				System.out.println("예외발생 : " + ex.getMessage());
				// ex.printStackTrace();
			}
			
		}
		
		static void readFile() throws Exception { // 모든 예외를 던지세요 = 메소드 뒤에 throws Exception 적기
			FileInputStream fis = null;
			try {
				fis = new FileInputStream("happy.txt");
			}finally { // catch 사용 안 하고 여기에는 finally만 
				fis.close(); // 에러를 다 던져버렸기 때문에 try~catch 안 써줘도 됨 
			
			}
		}		
	
}

/*
 * throws는 메소드 내에서 예외를 직접 처리하지 않고 호출자에게 예외 처리를 위임할 때 사용됩니다.
 * 즉, 예외를 발생시킬 수 있는 메소드에서 예외를 처리하지 않고, 메소드의 호출자에게 예외를 전파할 때 유용합니다.
 * 
 * 
 */