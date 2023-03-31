package com.edu.extendapp.use;
import com.edu.extendapp.animal.Bird;
import com.edu.extendapp.animal.Duck;

class UseDuck2 {
	public static void main(String[] args) {
		Bird b=new Duck();  //자식에 의해 메모리에 딸려 올라간 부모는 자식의 주소값에 붙어산다
		System.out.println("b의 주소값"+b);

		System.out.println(b.name);

		Duck c=(Duck)b;
		System.out.println("c의 주소값"+c);
		System.out.println(c.name);
	}
}
