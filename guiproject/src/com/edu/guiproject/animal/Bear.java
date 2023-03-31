package com.edu.guiproject.animal;

/*추상클래스는 불완전하므로 new 연산자로 직접 인스턴스를 생성할 수 없음 
하지만 추상클래스로 사용하려고 만든 것이므로, 생성만 되면 일반클래스와 
마찬가지로 사용 가능 추상클래스는 자식클래스가 불완전한 메서드인 추상메서드를
재정의 하고, 자식을 new 할 때 부모의 인스턴스로 함께 군집화되어 생성됨
결론 : 자식을 통해 인스턴스가 생성됨*/
abstract public class Bear {
	String name="나는 곰";
	public void eat(){
		
	}
	abstract public void sleep();
}
