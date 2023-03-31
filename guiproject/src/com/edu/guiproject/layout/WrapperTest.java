package com.edu.guiproject.layout;
/*
Wrapper Class란?
개발을 하다보면 자바의 기본자료형과 객체자료형 간의 형변환이 필요한 경우가 많음
ex) int x=3; 기본자료형
	  String str="3"; 객체자료형
	  String result=Integer.toString(x);  3 -> "3"
	  int y=Integer.parseInt(result);  //"3" -> 3  , parseInt : 클래스 변수로 직접 사용 가능
Wrapper 클래스는 int형뿐만 아니라, 자바의 모든 기본자료형마다 1:1 대응하여 지원
byte --> Byte(객체)
short --> Short(객체)
int --> Integer(객체)
long --> Long(객체)
double --> Double(객체)
char --> Charactor(객체)
boolean --> Boolean(객체)
*/
class WrapperTest {
	public static void main(String[] args) {
		int x=3;

		//숫자형 객체(boxing) - 문자형 객체 -> 객체타입 문자(unboxing)
		String str=Integer.toString(x);  
		System.out.println(str+str);

		//문자형 객체(boxing) -숫자형 객체 -> 객체타입 숫자(unboxing)
		int result=Integer.parseInt(str);  
		System.out.println(result+result);
	}
}
