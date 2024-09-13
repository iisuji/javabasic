package b_operator;

/*문자열 처리하는 클래스
 * 
 *  - String : 보통 String을 사용하나 회사에서는 속도문제로 아래 두 개를 사용할 수 있음 
 *  - StringBuffer / StringBuilder : 문자열 변화가 심해서 메모리를 많이 차지할 것 같은 경우에 사용
 * 
 * */



public class Ex13_String별종 {

	public static void main(String[] args) {

		//String Buffer - String Builder 차이 
		//String Buffer는 동기화 보장, Builder는 동기화를 보장해주지 않음 
		// (Builder : 하나의 작업을 하는 동안 다른 작업을 하지 못하도록 막음) 
		StringBuffer sb = new StringBuffer("홍길동");
		sb.append("바보");
		//sb = sb+"바보"; ---> 에러 (String Buffer 연산자 사용 불가) 
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("홍길국");
		sb.append("바보");
		System.out.println(sb2);
		
		
		//String str = new String("홍길자");
		// [특권] new 생략 가능
		// 		 + 연산자 가능
		String str = "홍길자";
		str+="바보";  // str=str+"바보";
		System.out.println(str);
		
	}

}
