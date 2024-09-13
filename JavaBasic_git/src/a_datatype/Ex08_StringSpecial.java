package a_datatype;

/*
 * ****** 완전 중요 *******
 * 
 * String : 클래스임 (참조형)
 * 		---> 참조형은 무조건 new 연산자로 메모리 확보해야 함
 *		---> 단, 하나 String 특권으로 new 생략해도 됨 
 * 
 * 
 * */


public class Ex08_StringSpecial {

	public static void main(String[] args) {
//		String name=new String("홍길동");	
//		String name2=new String("홍길동");
		
		String name="홍길동";
		String name2="홍길동";
		
		// String 변수 자체를 비교
		// 내용이 같을 경우 new 생략하면, 자바 버추얼 머신이 두 변수가 동일한 내용임을 인식하고 주소값을 같게 처리
		// 현업에서 생략해서 많이 쓰이므로 헷갈리지 않게 주의할 것
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
