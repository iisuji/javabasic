package d_array;

public class Ex00_반복문복습 {

	public static void main(String[] args) {
		
		//java.lang 안에 있는 Math클래스, 따로 import 하지 않아도 됨
		//랜덤 숫자 뽑기 
//		int temp =(int)(Math.random() * 45) + 1; // 0.0 <= 랜덤값 < 1.0  // 1~45까지의 수를 랜덤으로 받음
//		System.out.println(temp + "/");	
     
		
		// for문 
		for(int i=0 ; i<6 ; i++) {
			int temp =(int)(Math.random() * 45) + 1; 
			System.out.print(temp + "/");
		}
		
		System.out.println(); // 개행
		
		
		//while문 
		int j=0;
		while(j<6) {
			int temp =(int)(Math.random() * 45) + 1; 
			System.out.print(temp + "/");
			j++;
		}
		
		System.out.println(); // 개행
	
		
		//do ~ while문
		int k=0;
		do{
			int temp =(int)(Math.random() * 45) + 1; 
			System.out.print(temp + "/");
			k++;
		}while(k<6);
		
		System.out.println();  // 개행 
		
	
	}

}
