class  Shoes{
	String brand;
	int price;
	boolean stock;  //�����

	//getter �����ϱ�
	public String getBrand(){
		return brand;
	}
	public int getPrice(){
		return price;
	}
	public boolean getStock(){
		return stock;
	}

	//setter �����ϱ�
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

	//getter�� �̿��Ͽ� �ɹ����� ���� ������ ����
	System.out.println("�귣��� "+s.getBrand());
	System.out.println("������ "+s.getPrice());
	System.out.println("���� "+s.getStock());
	}
}
