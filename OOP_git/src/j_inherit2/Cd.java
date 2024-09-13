package j_inherit2;

public class Cd extends Item{

	private String singer; 
	
	public Cd() {
		this("0", "제목없음", "유명한");
	}
	
	public Cd(String num, String title, String singer) {
		super(num, title);
		this.singer=singer;
	}
	
	public void output() {
		System.out.println("책 번호: " + num);
		System.out.println("책 제목: " + title);
		System.out.println("가수: " + singer);
	}
	
}
