package com.edu.extendapp.use;
import com.edu.extendapp.animal.Bird;
import com.edu.extendapp.animal.Duck;

class UseDuck2 {
	public static void main(String[] args) {
		Bird b=new Duck();  //�ڽĿ� ���� �޸𸮿� ���� �ö� �θ�� �ڽ��� �ּҰ��� �پ���
		System.out.println("b�� �ּҰ�"+b);

		System.out.println(b.name);

		Duck c=(Duck)b;
		System.out.println("c�� �ּҰ�"+c);
		System.out.println(c.name);
	}
}
