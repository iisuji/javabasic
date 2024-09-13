package a_datatype;

/*
 * [주의] String 이름으로 클래스명 지정하면 안 된다. 
 * 
 * [데이터타입 - 자료형] 
 * 
 * 	1. 기본형
 * 	2. 참조형 : 배열, 클래스 
 *      --> 반드시 new 예약어를 메모리 확보해야 한다. 
 *      --> String은 클래스이므로 항상 대문자로 시작해야 한다. 
 * 
 * 		*String은 자바가 만들어준 클래스
 * 
 */


public class Ex07_String {

	public static void main(String[] args) {
		int age =30;
		
		// [1] 클래스 변수 선언
		// [2] 메모리 확보 
		String name;
		name=new String("홍길동");
		
		
		String name2=new String("홍길동");
		
		/*
		 * name 변수의 값과 name2 변수의 값이 같다면 "이름이 같다" 출력
		 * 그렇지 않다면 "이름이 다르다" 출력
		 * String 변수 자체를 비교하면, 주소값으로 비교하게 되기 때문에 실제로는 주소값이 다르다.
		 * 그래서 원하는 결과값이 나오지 않으므로, 그 내용을 나타내는 문자열 값을 비교하는 내용으로 식을 써줘야 한다. 
		 */
		
		//String 변수 자체를 비교 
		if(name==name2) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		}  
		
		// 문자열 값을 비교한다면???
		if(name.equals(name2)) {
			System.out.println("이름이 같다");
		}else {
			System.out.println("이름이 다르다");
		}
		
	}

}
