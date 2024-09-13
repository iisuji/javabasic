package b_operator;

// AND와 OR에서는 첫 번째 조건의 결과에 따라 두 번째 조건을 확인하지 않아도 결과가 정해진다.
// 따라서, 두 번째 조건 실행을 하지 않는 것이 효율적인데 이것을 Short circuit logic 이라고 한다. 
// 결과 도출을 위해 최소한의 논리식만을 평가하는 방식 

public class Ex09_ShortCircuitLogic {

	public static void main(String[] args) {
		
		int a = 3;
		if(a>3 && ++a>3) { 
			System.out.println("조건만족");
		}  // &&, & 둘 다의 경우 if 조건 만족하지 않아 "조건만족" 글을 출력하지 않음 
		   // 이때, a의 값 계산은 아래와 같이 된다. 
		
		System.out.println("A=" + a);
		// &&으로 썼을 경우 a>3에서 이미 false 이므로, && 앞부분만 계산하여 a=3 그대로이다. 
		// &으로 변경시, if 조건문까지만 수행하고 조건이 맞지 않아 "조건만족" 글자는 나오지 않지만
		// ++a까지 계산되어 a=4 가 나오게 된다. 요즘은 &으로만 많이 쓰인다. 결과값이 다르므로 주의!  

		
		//----------------------------------------------
		
		int b=3;
		if(b>1 || ++b>3) { 
			System.out.println("조건만족2");
		}
		System.out.println("B=" + b);
		
		// 둘 중 하나인 맨 앞에 b>1 이 true이기 때문에 뒤에 것은 계산할 필요가 없다고 생각하고
		// 논리 연산자 || (or) 뒤의 코드는 읽지 않음 
		
	}
}
