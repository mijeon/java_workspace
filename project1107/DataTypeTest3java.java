class  DataTypeTest3 {
	public static void main(String[] args) {
		byte b1=30;
		byte b2=20;
		byte result=0;
		//숫자 자료형의 연산 시 주의할 점
		//자바에서는 int 형보다 용량이 작은 자료형 간 연산을 수행할 경우
		//자동으로 int형으로 변환되어 연산을 수행하므로, 그 결과 또한 int형이 반환된다
		//기존의 고전적인 프로그래밍 시절부터 32비트 기반인 int형이
		//연산의 최적화된 자료형이기 때문 (int형 간 속도가 가장 빠름)
		result=b1+b2;
	}
}
