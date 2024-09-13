package c_control;

/*
 
 	콘솔로 전화번호 입력 받아서
 	지역번호를 추출하여
 	switch 문장을 이용하여 지역 이름을 출력
 	ex) 02  : 서울
 		032 : 인천
 		031 : 경기도
		064 : 제주도
 		나머지 : 한국 
 	
 */

import java.util.*;

public class Ex04_switch_전화번호 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("전화번호 입력 ->");
		String tel = input.nextLine();
		int idx = tel.indexOf('-'); 
		String localNum = tel.substring(0,idx);
		
		String number = "";
		
		switch(localNum) {
		case "02" : number = "서울"; break; 
		case "032" : number = "인천"; break;
		case "031" : number = "경기도"; break;
		case "064" : number = "제주도"; break;
		default : number = "한국"; 
		
		}
		
		System.out.println("이 번호는 " + number + " 지역 번호입니다");
		
		
		
		
	}

}
