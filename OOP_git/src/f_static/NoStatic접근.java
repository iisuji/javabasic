package f_static;

// 클래스 객체 생성해서 안에 접근하는 방법이 static을 붙여서 접근하는 방법보다 일반적인 방법이다. 

public class NoStatic접근 {

	String name = "홍길동";
	
	public static void main(String[] args) {
		
		// 클래스를 메모리에 올리는 방법 = 객체 생성 
		// main 함수는 한 번 실행되는 것이므로 자기 클래스를 자기가 불러줘도 됨 
		NoStatic접근 obj = new NoStatic접근();
		
		System.out.println("고객명: " + obj.name);
		
	}

}
