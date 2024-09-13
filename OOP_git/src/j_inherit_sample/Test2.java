package j_inherit_sample;

import java.awt.Frame;

// 상속 
public class Test2 extends Frame{
	
	Test2(){
		super("나의 두 번째 창");
		setBounds(100, 100, 500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
		Test2 t = new Test2();

	}

}
