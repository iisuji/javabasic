package b_operator;

public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a=5;
		int b=7;
	

		System.out.println("A="+ a + ", B=" + b);
		System.out.println("A="+ a + 1+ ", B=" + b +1);	// [주의]
		 				   // A=51, B=71  ---> 문자열로 인식 
		System.out.println("A="+ (a + 1) + ", B=" + (b +1)); // 먼저 계산해야할 것 	
	
		
		//애초에 a, b를 분리해서 변수 설정을 해주면 더 깔끔
		a = a + 1;
		b = b - 1;
		System.out.println("A=" + a + ", B=" + b);
		
		// 증가감소연산자 (자바에서는 계속 사용중이므로 알아야 함, 파이썬 이후 언어에서는 사용 안 함)
		a++; // a = a + 1;
		b--; // b = b - 1;
		System.out.println("A=" + a + ", B=" + b);
		
		
		// 증가감소연산자 앞에 위치하는 것도 가능
		++a; // a = a + 1;
		--b; // b = b - 1;
		System.out.println("A=" + a + ", B=" + b);
		
		// 결론 : a=a+1  a++  ++a  ---> 모두 같은 결과값을 냄 
		
		//---------------------------------------------------
		int z=10, y=10;
		int result = ++z; // z=z+1; int result = z;
		System.out.println(result); //11
		
		int result2 = y++; // int result2 = y;  y=y+1;
		System.out.println(result2); // 10 
		
		System.out.println("Z=" + z + ", Y=" + y);  // Z=11, Y=11
		
		System.out.println("Z=" + ++z + ", Y=" + --y); // Z=12, Y=10
		System.out.println("Z=" + z++ + ", Y=" + y--); // Z=12, Y=10  
		
		System.out.println("Z=" + z + ", Y=" + y);
		
	}

}
