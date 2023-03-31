package com.edu.extendapp.human;

public class WhitePerson extends Person{
	String eyeColor="blue";
	
	//상속관계에서, 부모의 메서드와 완전히 100% 일치하는 메서드를
	//자식이 정의하면, 부모의 메서드를 재정의했다고 하며 Overriding이라고 함
	//현실에서의 업그레이드와 비슷한 개념
	public void talk(){
		System.out.println("백인이 조잘조잘");
	}
}
