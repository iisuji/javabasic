package m_Interface.yesinterface;

// interface는 public abstract 쓰지 않아도 이미 들어와 있음. 기재해주는 게 좋음 

public interface DBDriver {
	public abstract void connect();  //public 자동으로 들어오더라도 꼭 기술해줄 것! 오버라이딩 할 때 헷갈릴 수 있음 
	void insert(); // 이렇게만 써줘도 구동됨 
}
