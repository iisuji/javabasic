package c_exercise2;

public class Product {
	
	private String poductNo;
	private String productName;
	private int stock;
	
	public void setPoductNo(String poductNo) {
		this.poductNo = poductNo;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public void income(int count){
		stock = stock+count;
	}
	
	public void sale(int count){
	    stock = stock-count; 
	}
	
	public void output(){
		System.out.println("상품번호: "+poductNo + ", 상품명: " + productName + ", 재고량: "+ stock );
	}
	
	
	
}
