package com.edu.extendapp.human;

public class WhitePerson extends Person{
	String eyeColor="blue";
	
	//��Ӱ��迡��, �θ��� �޼���� ������ 100% ��ġ�ϴ� �޼��带
	//�ڽ��� �����ϸ�, �θ��� �޼��带 �������ߴٰ� �ϸ� Overriding�̶�� ��
	//���ǿ����� ���׷��̵�� ����� ����
	public void talk(){
		System.out.println("������ ��������");
	}
}
