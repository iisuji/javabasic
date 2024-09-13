package e_method;

public class Ex05_리턴타입 {

	public static void main(String[] args) {
		
		int[] result = add();
		int sum = result[0] + result[1];
		System.out.println("합:" + sum);		
	}

	static int[] add() { // 2.int[] 로 맞춰준다. 
		int a=10, b=20;
		
		// a,b 값을 호출한 곳으로 넘긴다면?
		int[] data = {a, b};
		return data; // 1. return은 값을 단 한 개밖에 못 가져가기에, a,b를 배열로 하나로 묶어서 가져간다
	}
	
}
