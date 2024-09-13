package j_inherit2;

/*
 * 
 * 	<this / super>
 * 		this : 자기 객체를 지칭
 * 		super : 부모 객체를 지칭 
 * 
 */


public class Book extends Item {

	private String writer;
	private String publisher; 
	
	public Book() {
		num = "0000";
		title = "제목없음";
		publisher = "미정";
	    writer = "무명";
	    System.out.println("자식 기본 생성자 함수");
	}
	
	public Book(String num, String title, String publisher, String writer) {  
				// 파라미터는 여기에만 머물다가 아래로 넘어가면 다 날라감. 그래서 this를 통해서 아래를 채워줘야 함. 
		//super.num = num;   // 부모 클래스 객체 구분 super 
		//super.title = title;   // 부모 클래스 객체 구분 super
		super(num, title);  // 부모의 생성자의 인자를 부를 때 super, 무조건 첫 줄에 와야 함  
		this.publisher = publisher;
		this.writer = writer;
		System.out.println("자식 인자 생성자 함수");
	}
	
	//overriding
	public void output() {
		System.out.println("책 번호: " + num);
		System.out.println("책 제목: " + title);
		System.out.println("출판사: " + publisher);
		System.out.println("작가:" + writer);
	}
	
}
