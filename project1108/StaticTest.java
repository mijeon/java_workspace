class StaticTest {
	int a=8;  //인스턴스 변수 : 인스턴스가 생성될 때 메모리에 올라가는 변수
	static b=8;  //static 변수 : 클래스 원본 변수, 메모리에 올리지 않고 main() 에서 바로 참조 가능

	public static void main(String[] args) {
		a=7;  //참조 불가능
		b=7;  //참조 가능
	}
}
