package c_control;

/*
 * 주민번호, 전화번호 등은 숫자로 하면 연산될 수도 있기 때문에 문자열로 적어야 한다. 
 * 
 * 	1 : int
 * '1': char
 * "1": String
 * 
 * */


public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		
		String id="880205-2345678";
		char sung = id.charAt(7);  // 한 자리일 때 charAt()
		
		// 그 문자가 1이라면 '남자' 출력
		// 그 문자가 2라면 '여자' 출력
		
	/*
		  if(sung=='1') { //char 형이면 문자 비교를 해주어야 한다. 그래야 출력됨 
		  System.out.println("남자");
		  }else if(sung=='2') { System.out.println("여자"); }
	*/	
	
		String gender="";  // 자바에서는 초기화 
		
		// 그 문자가 1이거나 3이거나 9라면 '남자' 출력
		// 그 문자가 2이거나 4이거나 0이라면 '여자' 출력
		
		if(sung=='1' || sung=='3'|| sung=='9') {
			//System.out.println("남자");
			//String gender ="남자";  // if 바깥에 String을 선언해주고 여기에서는 String 제거
			gender="남자";
		}else if(sung=='2'||sung=='4'||sung=='0') {
			//System.out.println("여자");
			//String gender="여자"; // if 바깥에 String을 선언해주고 여기에서는 String 제거
			gender="여자";
		}
		
		System.out.println("당신은" + gender + "입니다");
		

	}
	
}
