package c_control;

public class Ex02_if_학번 {

	public static void main(String[] args) {
	
		String hakbun ="2017111001";   //문자열 변수 hakbun에 "학번" 선언
		
		// 입학연도 구하기
		String year = hakbun.substring(0,4); // 0번째부터 4번째 앞! 까지 문자열 자르기해서 year에 넣기

		//단과 구하기
		
		char dan = hakbun.charAt(4); // 4번째 위치한 한 글자를 추출 
		String college ="";  
		String collnum="";  
		String num = hakbun.substring(5,7); 
		
		if(dan=='1') { // 한 글자인 '문자'일 때에는 '==' 사용 가능
			college="공대";
			if (num.equals("11")) {
				collnum="컴퓨터학과";
			}else if(num.equals("12")) {
				collnum="소프트웨어학과";
			}else if(num.equals("13")) {
				collnum="모바일학과";
			}else if(num.equals("22")) {
				collnum="자바학과";
			}else if(num.equals("33")) {
				collnum="서버학과";
			}
			
		}else if(dan=='2') {
			college="사회대";
			if(num.equals("11")) {
				collnum="사회학과";
			}else if(num.equals("12")) {
				collnum="경영학과";
			}else if(num.equals("13")) {
				collnum="경제학과";
			}
		}
		
		
		// 결과 출력
		String result = hakbun + "은 " + year + "년도에 입학한 "+college +" "+ collnum +" 학생입니다"; 
		System.out.println(result);

		}
		
		
	}
	

