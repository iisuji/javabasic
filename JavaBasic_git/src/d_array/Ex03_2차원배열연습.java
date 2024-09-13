package d_array;

public class Ex03_2차원배열연습 {

	public static void main(String[] args) {
		int a[][]=new int[][]{
							 {3,-5, 12 }, 
							 {-2, 11, 2, -7}, 
							 {21, -21, -35, -93, -11}, 
							 {9, 14, 39, -98}
							 };

							 
		//출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length ; j++) {
				System.out.print(a[i][j]+"/");
			}
			System.out.println();
		}
		
		//a배열의 모든 값의 합을 구하기
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum=sum+a[i][j];
			}
		}
		System.out.println("합: " + sum);
		
							 
		//-----------------------------------
		// 각 행의 값들 합이 가장 큰 행을 구하기 
		int hap[] = new int[a.length];	// hap 배열의 각 요소는 a 배열의 각 행의 합계를 저장하는 데 사용됨		 
					 
		for(int i=0 ; i<a.length ; i++) {  // a.length = 4 (행의 수)
			for(int j=0 ; j<a[i].length ; j++) { 
				hap[i]=hap[i]+a[i][j];  // a의 i번째 행의 j번째 열 값을 hap[i]에 누적
			  //hap[0]=hap[0]+a[0][0] ---> 3
			  //      =hap[0]+a[0][1] --->-5
			  //      =hap[0]+a[0][2] --->12	
			  // ... hap[1], hap[2], hap[3]도 같은 루프 
			}
		}
		
		
		//출력
		for(int i=0; i<hap.length; i++) {
			System.out.println(i+"번째 줄의 합:" + hap[i]);
		}
		
		//합이 가장 큰 행을 출력하기
		int max = hap[0];  // 배열의 첫 번째 요소를 최대값으로 설정하고 초기화
		int idx = 0;  // 최대값의 인덱스를 초기화 
		for(int i=1; i<hap.length ; i++) {
			if(max < hap[i]) { // 이미 첫 번째 요소를 최대값(max)으로 설정했으므로, 배열의 두 번째 요소부터 시작하여, 현재의 최대값(max) 보다 큰 값(hap[i])이 발견되면
			   max = hap[i]; // 최대값과 인덱스를 업데이트한다. (최대값은 hap[i]가 된다)  
			   idx=i;
			}
		}
		
		
		System.out.println("합이 가장 큰 값 : " + max);
		System.out.println("합이 가장 큰 행 : " + idx);
		
		
	}

}
