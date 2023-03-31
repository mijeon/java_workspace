/*
모든 언어에는 배열이 지원되며, 개념은 모두 같다
약간의 문법 표현만 틀림
주의) js는 진입장벽이 낮기 때문에 배열 선언 시 크기를 명시하지
않아도 되었지만, c, java, c# 등과 같은 일반적인 응용 프로그램
에서는 배열 선언 시 반드시 그 크기를 명시해야 함
*/
class  ArrayTest1{
	public static void main(String[] args) {
		//자바의 모든 자료형 마다 배열을 지원함
		//byte, short, int, long
		//char
		//float, double
		/*
		byte[] b=new byte[3];
		System.out.println("배열의 크기는 " + b.length);
		*/
		char[] c=new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		//자바에서는 모든 실수는 double로 처리됨
		//따라서, float을 사용하고 싶다면, float형임을 명시해야 함
		float k=3.14f+0.23f;

		//String은 객체이지만, 사용빈도가 너무 높기 때문에
		//new 연산자에 의하지 않고 마치 일반 데이터타입처럼
		//생성할 수 있는 묵시적(암시적) 생성법을 지원함

		//명시적 생성법 - explicit
		String s=new String("Korea");  

		//묵시적(암시적) - implicit
		String s2="Korea";  //암시적(드러내지 않고 생성)

		String [] fruit=new String[3];

		//좋아하는 과일 3개 담고, 반복문으로 출력
		fruit[0]="banana";
		fruit[1]="apple";
		fruit[2]="orange";

		for(int i=0;i<fruit.length;i++){
			System.out.println(fruit[i]);
		}
	}
}
