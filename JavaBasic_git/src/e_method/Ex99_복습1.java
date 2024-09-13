package e_method;

public class Ex99_복습1 {
	// 순서 흐름 판단하기 
	
	public static void main(String[] args) {
		System.out.println("A");  // 1 메인함수부터 시작 
		test(); // 2 
		System.out.println("B"); // 9 메인함수 끝 
	}
	static void test() {
		System.out.println("C");  // 3
		sample(); // 4
		imsi(); // 6
		System.out.println("D"); //8			
	}	
	static void sample() {  
		System.out.println("E"); // 5	
	}
	static void imsi() {
		System.out.println("F"); // 7	
	}
}
