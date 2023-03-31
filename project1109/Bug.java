class  Bug{
	//modifier(수식자=수정자) static : 고정된, 정적인
	//static으로 선언한 변수는, 인스턴스 생성시 해당 인스턴스로 딸려올라가지 않음
	//즉, 클래스 원본에 고정됨 정적변수, 클래스변수라 함
	static String type="곤충";
	String name="벅";

	public void fly(){
		System.out.println("윙윙");	
	}

	public static void main(String[] args){
		//mame="버그";  //인스턴스가 태어나지 않아 참조 불가능
		//Bug.type="fish";  //클래스 변수로 참조 가능, 같은 클래스 내에선 클래스명 생략 가능

		int age=8;
		Bug b=new Bug();
		System.out.println("age is "+age);
		System.out.println("b is "+b);
	}	

}
