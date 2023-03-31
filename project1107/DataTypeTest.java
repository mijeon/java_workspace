/*기본 지료형 간의 형변환에 대해 학습*/
class DataTypeTest{
	public static void main(String[] args) {
		//byte 1, short 2, int 4, long 8
		//float 4, double 8
		byte b=23;   //1 byte -128 ~ 127
		short s=56;  //2 byte
		//b=s;
		//s=b;  //자동 형변환 b가 s로 자동으로 변환
		int k=56;
		//s=k;
		//k=s;  //s가 k로 자동 형변환
		char c='A';  //결국에는 숫자로 변환됨
		c=b;  //비록 char가 용량은 크지만, 표현 범위에 있어서는 음수를 표현할 수 없기 때문에 컴파일 에러남
		
	}
} 


