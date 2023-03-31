package com.edu.guiproject.layout;
/*
Wrapper Class��?
������ �ϴٺ��� �ڹ��� �⺻�ڷ����� ��ü�ڷ��� ���� ����ȯ�� �ʿ��� ��찡 ����
ex) int x=3; �⺻�ڷ���
	  String str="3"; ��ü�ڷ���
	  String result=Integer.toString(x);  3 -> "3"
	  int y=Integer.parseInt(result);  //"3" -> 3  , parseInt : Ŭ���� ������ ���� ��� ����
Wrapper Ŭ������ int���Ӹ� �ƴ϶�, �ڹ��� ��� �⺻�ڷ������� 1:1 �����Ͽ� ����
byte --> Byte(��ü)
short --> Short(��ü)
int --> Integer(��ü)
long --> Long(��ü)
double --> Double(��ü)
char --> Charactor(��ü)
boolean --> Boolean(��ü)
*/
class WrapperTest {
	public static void main(String[] args) {
		int x=3;

		//������ ��ü(boxing) - ������ ��ü -> ��üŸ�� ����(unboxing)
		String str=Integer.toString(x);  
		System.out.println(str+str);

		//������ ��ü(boxing) -������ ��ü -> ��üŸ�� ����(unboxing)
		int result=Integer.parseInt(str);  
		System.out.println(result+result);
	}
}
