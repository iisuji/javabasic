package c_control;

import java.util.Calendar;

public class Ex03_나이구하기 {

	public static void main(String[] args) {
		
		String id="880205-2123456";
		//String id="010101-4123456";
		
		//주민등록 년도 / 월 / 일
		String nai = id.substring(0, 2);  //nai = "88" --> nai 라는 변수에 88이라는 문자가 들어있다는 뜻
		int sunai = Integer.parseInt(nai); // "88"  --> 88 (계산하기 위해, 문자를 숫자로 변환하려 함 --- 형변환 필요) 
										   // 형변환시 (string) nai 라고 쓰지 않음 ---> Integer.parseInt(nai) 
		
		
		String juMon = id.substring(2, 4); //주민등록상 월 추출
		int juMonth = Integer.parseInt(juMon); 
	
		String juDa = id.substring(4, 6); //주민등록상 일 추출 
		int juDate = Integer.parseInt(juDa);
	
		
		char sung = id.charAt(7);
		
		// 올해 년도, 월, 일 구하기
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; //month는 0부터 계산 되기 때문에 +1값을 해줘야 한다. 
		int date = cal.get(Calendar.DATE);
	
		
		int age=0;  // 초기화, 숫자이므로 0으로 써준다. 	
		
		if(sung=='1' || sung=='2') { // 성별 문자가 '1'이거나 '2'라면
			age=year-(1900+sunai)+1;
		} else if(sung=='3' || sung=='4') { // 성별 문자가 '3'이거나 '4'라면
			age=year-(2000+sunai)+1;
		} else if(sung=='0'|| sung=='9') {
			age=year-(1800+sunai)+1; 
		}
		
//		System.out.println("한국나이=" + age);
		
		
//		// 만 나이 구하기 ---------------------------------------------- 
//		
		// 만 나이 = 올해년도 - 주민등록년도		
		int manAge = age;
		System.out.println(manAge);
		int realAge= 0; 
		
		// 월과 일이 둘 다 지났을 경우, manAge-1
		// 월과 일이 둘 다 지나지 않았을 경우, manAge-2 
		
		// 지금 월보다 주민등록상 월이 큰 경우
		
		if(juMonth<month) {   
			realAge=manAge-1;
		}else if(juMonth==month){ 
			if(juDate<=date) {
				realAge=manAge-1;
			}else if(juDate>date){
				realAge=manAge-2;
			}
		}else if (juMonth>month){
			realAge=manAge-2;
		}
		
		System.out.println("나의 만 나이는 "+ realAge + "살입니다.");
	
		
		
		
				

		
		
		
	}
	
}


/*
	Wrapper class : 자료형 클래스
	
		int : Integer
		long : Long
		double : Double   (대문자로 하면 클래스가 됨)


*/