class DataTypeTest2{
	public static void main(String[] args){
		int a=27;
		short s=17;
		//손실을 감수하고서라도, 강제로 자료형을 작은 자료형으로 변환하는 것을 가리켜 강제 형변환
		//이때 () 소괄호를 cast 연산자라고 함
		//큰 자료형 -> 작은 자료형으로 변환하려고 할 때 발생
		s=(short)a;  

		//특히, 형변환이라는 것은 비슷한 자료형간 가능
		//(문자, 숫자), 논리값
		boolean b=true;
		//a=b;  //불가능 (같은 자료형이 아니어서)
	}
}
