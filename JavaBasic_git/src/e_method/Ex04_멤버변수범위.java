package e_method;

public class Ex04_멤버변수범위 {
	
	// 멤버 변수 선언
	// 메인 밖에서 변수 선언하면 아래 범위에 전부 포함되어 인자 보내고 파라미터 받고, 리턴 등 안 해도 됨 
	// 일단 알아만 둘 것
	
	// 멤버 변수 선언 --> 앞에 static 붙여줘야 함 
	static int a=10, b=20;  
	static int sum=0;  // 멤버변수는 자동초기화 되지만, 그래도 구분하기 헷갈리니 초기화 습관화 할 것 
	                   // static int sum; 이라고 해도 됨 
	
	public static void main(String[] args) {
		
		add();
		System.out.println("합:" + sum);
	}
	
	static void add() {
		sum = a+b;
	}

	
}
