package c_control;

public class Ex04_switch_정리 {

	public static void main(String[] args) {
		
		int a = 10;
		switch(a/3) {
		case 1 : System.out.println("일"); //break;  // break 잊지 말 것! 
		case 2 : System.out.println("이"); //break;
		default : System.out.println("나머지"); //break; // default 위치는 중간에 있어도 됨
		case 3 : System.out.println("삼"); //break;
		case 4 : System.out.println("사"); //break;
		
		}

	}

}
