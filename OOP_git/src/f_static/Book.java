package f_static;

/*
 *  static : 공유하기 위해 사용
 *    - 메모리에 단 1번 설정(지정) 
 *    - 메모리에 먼저 올라옴 
 *    - static 붙어있으면 객체 생성 없이 클래스명 접근 가능 (***중요***)
 *    
 *  
 *  정상) static을 안 붙이면 객체 마다 생성
 *  별종) static을 붙이면 하나의 static 영역에서 count가 올라가고 각 객체에 뿌림   
 *  
 */

public class Book {

//	static int count; 
//	
//	Book(){
//		count++;
//	}
	
//	private static int count; 
//	
//	Book(){
//		count++;
//	}
//	
//	public static int getCount() {  // getter 함수 생성 
//		return count;
//	}
	
	static {
		System.out.println("딱 한번");
	} // static 초기화 
	
	
	
}
