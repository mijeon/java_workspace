/*�ڹٿ����� ��� �ڵ�� �ݵ�� class �ȿ� �ξ�� �ϹǷ�, 
������ ��ü�� ǥ������ �ʴ� Ŭ������ ������, main() �޼��带
�η��� Ŭ���� �ȿ� �����ؾ� ��*/
//main()�� �α� ���� Ŭ����
class UseArrow {
	//main()�� �����ڰ� ��������� ���� �� �̸��� ȣ���� �� ����
	//java.exe�� ����, �� ���� �� ������ main()�� ã��
	public static void main(String[] args) {
		//ȭ�� 1�� �ν��Ͻ� ����
	new Arrow();  //����
	System.out.println("�ν��Ͻ� ���� ����");
	
	//int(�ڷ���) b=3;
	//Arrow - ����� ���� �ڷ���
	Arrow a=new Arrow();
	a.fly();
	System.out.println("ȭ���� ������ "+a.color);
	}
}
