package com.edu.extendapp.use;
import com.edu.extendapp.animal.Bird;
import com.edu.extendapp.animal.Duck;

class UseDuck {
	public static void main(String[] args) {
		/*
		���� : char
		���� : ���� : byte < short < int < long
		        �Ǽ� : float < double
	    ���� : boolean

		�ڹ��� �⺻�ڷ��������� ���� ����� �ڷ����� ��� ����ȯ�� �����ϴ�
		�ڹ��� �ڷ����� ��ü�ڷ����� �����Ͽ� �� 4���̴�
		��ü�ڷ����� �ڷ����̹Ƿ�, ����ȯ�� �����ϴ�
		*/
		int x=5;
		byte k=10;
		k=(byte)x;  //��������ȯ
		x=k;  //�ս��� �߻����� �ʱ� ������ �ڵ�����ȯ byte -> int

		Bird b=new Bird();  //�����ڷ���
		Duck d=new Duck();  //�����ڷ���
		b=d;  //Duck -> Bird������ �ڵ�����ȯ
		System.out.println(b.name);
	}
}
