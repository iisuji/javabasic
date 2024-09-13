package d_array;

import java.util.*;

public class Ex01_요일 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();  // 이미 시스템이 가지고 있는 값을 가지고 올 거라서 new.Calendar(); (x)
		System.out.println("현재 날짜 확인");
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH)+1 +"월");  //month는 0부터 세기 때문에 +1을 해줘야 한다.
		System.out.println(cal.get(Calendar.DATE)+"일");
		
		System.out.println("현재 시간 확인");
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		
		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)-1]+"요일");  //-1하면 금요일이 5 
		// SUNDAY : 1,.... FRIDAY : 6
		
		int yoilnum = cal.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(yoil[yoilnum] + "요일");		
		
	}

}
