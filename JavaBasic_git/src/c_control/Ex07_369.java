package c_control;

public class Ex07_369 {

	public static void main(String[] args) {

		for(int i=0; i<=50;i++) {    //1~50까지의 숫자만 체크
			int su = i;  
			boolean su369 = false;  //십의 자리, 일의 자리에 3,6,9가 있으면 true, 없으면 false로 나타내기 위해 boolean타입 변수 선언
			
			while(su!=0) { // 0이 아닌 숫자를 반복하겠다 				
				int na = su%10;	  // su를 10으로 나눈 나머지가 na (일의 자리 판단 위해)			
				if(na==3| na==6 | na==9) {  // 나머지 na가 3, 6, 9라면 
					System.out.print("짝");  // --> println()으로 쓰면 개행되면서 찍히게 되므로 print()로 작성
					su369 = true;
				}
				su = su/10;  //su를 10으로 나눈 몫을 다시 su에 저장 (십의 자리 판단 위해)
			}

			if(!su369) { // su369가 if문 통과한 후 true면---> false, false면 --->true   
				System.out.println(i);  // 해당하는 글자를 찍어라 
			}else {
				System.out.println(); // 개행 
			}

			//			if(su369) {
			//			System.out.println();  // su369=false 
			//		}else {
			//			System.out.println(i);
			//		}		

		}


	}

}
