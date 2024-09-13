package b_operator;

public class Ex14_복습 {

	public static void main(String[] args) {
		
		int kor=45;
		int eng=67;
		int math=77;
		
		int total=kor+eng+math;
		
		//총점이 150보다 크고 250보다 작으면 '보통반입니다' 출력
		if(total>150 && total<250) {
			System.out.println("보통반입니다");
		}	
	}	
}
