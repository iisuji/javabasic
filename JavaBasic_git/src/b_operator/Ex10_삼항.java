package b_operator;

public class Ex10_삼항 {  

	public static void main(String[] args) {
		
		// 정수가 80점 보다 크면 '합격'이라고 저장하고 아니면 '불합격'처리 
		int jumsu = 80;
		String result;
		
		if(jumsu > 80) {  
			result = "합격";
		}else {
			result = "불합격";
		}

		System.out.println("당신은 " + result + "입니다.");
		
		
		// 위 내용을 아래 내용처럼 축약해서 쓸 수 있다. 이게 삼항연산자 
		
		String result2 = (jumsu > 80) ? "합격": "불합격";    // 항이 세 개여서 삼항연산자 
		    		// 조건(괄호 생략 가능) ? "true 일 때" : "false 일 떄"
		System.out.println("당신은 " + result2);
		
		
	}

}