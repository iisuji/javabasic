package e_exercise;

import java.util.Scanner;
import d_array.Student;

public class GradeTest {

	public static void main(String[] args) {
		
		// 처리하려는 데이터 개수를 표준 입력 받는다.
		Scanner input=new Scanner(System.in);
		System.out.println("데이터 개수 크기 - ");
		int su = input.nextInt(); 
		
		// 입력된 데이터 개수 크기의 원소를 갖는 int 타입 배열을 생성한다. 
		int [] arr =new int[su];
		
		// 표준 입력으로 데이터를 받아서 첫 번째 원소부터 마지막 원소까지 저장한다.
		System.out.println("정수 데이터 입력");
		for(int i=0; i<su ; i++) {   // su = arr.length
			arr[i] = input.nextInt(); 
		}
		
		// 앞에서 만들어진 배열을 전달하면서 GradeExpr 객체를 생성한 후에
		// 총점과 평균을 구하는 메서드를 호출하여 출력 
		GradeExpr grade = new GradeExpr(arr);
		System.out.println("총점 : " + grade.getTotal());
		System.out.println("평균 : " + grade.getAverage());
		
	}

}
