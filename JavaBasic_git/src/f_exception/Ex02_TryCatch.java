package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		
		FileInputStream fis = null; // 바깥에 선언하기 
		
		try {
			fis = new FileInputStream("abc.txt");
			fis.read();
			System.out.println("파일처리");
		}catch(FileNotFoundException ex) { 
			System.out.println("파일이 존재하지 않는 에러발생" + ex.getMessage()); // 파일이 있는지 여부를 파악할 때 사용
			// ex.printStackTrace(); Exception 이 발생한 이유와 위치는 어디에서 발생했는지 전체적인 단계를 다 출력합니다.
		}catch(Exception ex) {  // 모든 예외를 잡음, 다른 예외와 사용할 경우 가장 뒤에 써줄 것 
			System.out.println("예외발생" + ex.getMessage());
		}finally {
			try { 
			fis.close(); // 가상통로는 반드시 닫아줘야 함. 예외처리 필요 (try ~ catch 함께 사용)
			}catch(Exception ex) {}
		}
	}

}
