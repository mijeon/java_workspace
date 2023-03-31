/*사람 정의*/
package com.edu.extendapp.human;

public class Person {
	//공통적인 특징은 부모에 정의함
	int arms=2;  //팔의 수

	public void talk(){
		System.out.println("사람이 조잘조잘");	
	}

	public void think(){
		System.out.println("사람이 생각해요");	
	}
}
