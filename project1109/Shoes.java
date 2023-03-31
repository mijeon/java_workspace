class  Shoes{
	String brand;
	int price;
	boolean stock;  //재고여부

	//getter 정의하기
	public String getBrand(){
		return brand;
	}
	public int getPrice(){
		return price;
	}
	public boolean getStock(){
		return stock;
	}

	//setter 정의하기
	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setStock(boolean stock){
		this.stock=stock;
	}

	public static void main(String[] args) {
		Shoes s=new Shoes();
		s.setBrand("Nike");
		s.setPrice(100000);
		s.setStock(true);

	//getter를 이용하여 맴버변수 값을 가져와 보기
	System.out.println("브랜드는 "+s.getBrand());
	System.out.println("가격은 "+s.getPrice());
	System.out.println("재고는 "+s.getStock());
	}
}
