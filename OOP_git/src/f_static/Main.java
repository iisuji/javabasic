package f_static;

public class Main {

//	public static void main(String[] args) {
	// 외부 허용 +  +리턴값이 없음(기본이 void 인 애만 main에 쓸 수 있음) 
		
//		Book b1 = new Book();
//		Book b2 = new Book();
//		Book b3 = new Book();
//		
//		System.out.println("책 개수 : " + b1.count);
//		System.out.println("책 개수 : " + b2.count);
//		System.out.println("책 개수 : " + b3.count);
		
		// 객체를 하나도 생성하지 않아도 static이 붙으면 메모리에 먼저 올라가므로 값(0)이 나옴  
//		System.out.println("책 개수 : " + Book.count);
//	}
	
//	public static void main(String[] args) {
//		
//		System.out.println("책 개수 : " + Book.getCount());
//		// Book 클래스 쪽에 static 써주지 않으면 에러남. --> public static int getCount()
//		
//	}

	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
	}
	
	
	
}
