package c_control;

// substring(a,b) : 문자열의 특정 부분을 잘라내는 데 사용 (a번째부터 b 앞에까지의 문자열) 
// chatAt() : String 타입(문자열)의 데이터에서 특정 문자(character)를 char 타입(문자)으로
//            변환할 때 사용하는 함수


public class Ex01_if_전화번호 {

		public static void main(String[] args) {
			
			String tel = "032-222-2222";   
			int idx = tel.indexOf('-'); // '-'의 앞부분 출력 
				// System.out.println(idx); // 출력 : 2  
			
 
			String localNum = tel.substring(0, idx); // 0번째부터 idx(2) 앞에까지의 문자열
				//System.out.println(localNum);   // 출력 : 02
			
			
			/*
			 (문제)
			  지역번호가 02라면 "서울" 출력
			  그렇지않고 지역변수가 032라면 "인천" 출력
			  나머지는 "한국" 출력
			  
			 */
		
			String local="";   // 초기화 
			if(localNum.equals("02")) {
				local="서울";
				// if(localNum=="02") 
				// ---> String if 문에서 == 대신 .equals 사용함! ==는 주소값을 찾음, .equals는 문자열값을 찾음.

			} else if(localNum.equals("032")) {
				local="인천";
			} else {
				local="한국";
			}
			
			System.out.println("당신의 지역은 " + local + "입니다.");
			
			
		}
}



/*

	지역번호에는 여러가지 자릿수가 있으므로, 하이픈 (-) 앞자리수를 계산해주어야 한다. 
	02-222-2222
	032-123-1234
	051-555-9876
    0505-234-2222
    
*/