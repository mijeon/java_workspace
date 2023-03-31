/*
모든 프로그램 언어의 시작인 변수와 연산자를 학습해보자
모든 프로그램에서 사용 가능한 기본자료형은 총 3가지 밖에 없다

1. 문자 - char (2 byte)
2. 숫자 - 정수 : byte (1 byte) < short (2 byte) < int (4 byte) < long (8 byte)
			실수 : float (4 byte) < double (8 byte)
3. 논리값 - boolean (1 byte)

자바에서 지원하는 기본 자료형은 위의 3가지 유형밖에 없는데
개발자가 개발 시, 자료형을 명시하는 이유는 메모리의 크기를 결정짓기 위함
*/
class VariableTest{
	public static void main(String[] args){
		//문자형 char
		char c='A';  //"" 사용 불가능, 에러 O
		char y=65;  //에러 X, 문자를 넣을 경우 10진수로 변환되므로 문자형은 사실상 x
		byte b=5;
		short c=7;
		int i=10;
		long d=20;
		float x=34.5f;
		double k=3.14;
		boolean a=true;
	}
}
