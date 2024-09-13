package e_exercise;

public class GradeExpr {

	//멤버변수 
	int [] jumsu;
	
	//생성자함수 
	public GradeExpr(int[] jumsu) {
		this.jumsu=jumsu;		
	}
	
	int getTotal() {
		int total=0;
		for(int i=0; i<jumsu.length ; i++) {
			total += jumsu[i]; 
		}
		return total;
	}
	
	double getAverage() {
		double avg = (double)getTotal() / jumsu.length;
		return avg;
	}
	
}
