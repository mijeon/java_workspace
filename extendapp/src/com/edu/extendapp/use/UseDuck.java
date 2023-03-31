package com.edu.extendapp.use;
import com.edu.extendapp.animal.Bird;
import com.edu.extendapp.animal.Duck;

class UseDuck {
	public static void main(String[] args) {
		/*
		문자 : char
		숫자 : 정수 : byte < short < int < long
		        실수 : float < double
	    논리값 : boolean

		자바의 기본자료형간에는 서로 비슷한 자료형일 경우 형변환이 가능하다
		자바의 자료형은 객체자료형을 포함하여 총 4개이다
		객체자료형도 자료형이므로, 형변환이 가능하다
		*/
		int x=5;
		byte k=10;
		k=(byte)x;  //강제형변환
		x=k;  //손실이 발생하지 않기 때문에 자동형변환 byte -> int

		Bird b=new Bird();  //상위자료형
		Duck d=new Duck();  //하위자료형
		b=d;  //Duck -> Bird형으로 자동형변환
		System.out.println(b.name);
	}
}
