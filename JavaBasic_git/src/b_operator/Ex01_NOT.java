package b_operator;

/*
 * 
 *  not : 결과에 반대로 하는 연산자
 *  
 *  	 - 일반논리 (true / false) not : !
 *   	 - 이진논리 not : ~  ---> (이런 이론이 있다는 정도로만 알아두어도 됨, 잘 사용하지 않음)
 * 
 * 
 * */

public class Ex01_NOT {

	public static void main(String[] args) {
		
		// 일반논리 not
		boolean result = 3 > 4;
		System.out.println(result);
		System.out.println(!result); // '!' 붙일 경우, 결과값을 역으로 나타냄

		// 이진논리 not
		int a = 15; // [0]0000000 00000000 00000000 00001111
					// 0 : 양수, 1 : 음수
		
		System.out.println(a);
		System.out.println(~a);
		           // [1]1111111 11111111 11111111 11110000
		
	}

}
