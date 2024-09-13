package c_control;

/*
 * 분기문 switch
 * 
 *  [주의] break 문R장 확인 : 수행하고 끝내려면 break를 써줘야 한다. 안 그러면 결과값 아래 case 결과값까지 다 나옴
 *  [주의] 문자형(char) / 정수형(int/long) / 문자열(String)
 *  버전에따라 String, switch 안 될 수도 있음
 * 
 */

public class Ex04_switch_주민번호 {

	public static void main(String[] args) {

		String id = "801212-1234567";
		char chul = id.charAt(8);		
		
		String local = "";
		
		switch(chul) {
		case '0' : local = "서울";	break; 
		case '1' : local = "인천/부산"; break;
		case '2' : local = "경기"; break; //경기를 local에 대입하고 벗어나! (분기문) 
		case '9' : local = "제주"; break;
		default : local = "한국";		
		}
		
		System.out.println("당신은 " + local + " 출신입니다.");

	}

}


/*

	주민번호에서 출신지 번호가
	0 : 서울
	1 : 인천/부산
	2 : 경기
	9 : 제주
	나머지 : 한국
    
    if(chul == '0'){
    	서울
    }else if(chul =='1'){
    	인천/부산
    }else if(chul =='2'){
    	경기
    }else if(chul =='9'){
    	제주
    }else{
    	한국 
    }
    
    //위와 같이 쓸 경우 너무 길어지므로, 이럴 때 swich 사용
    
    
    

*/