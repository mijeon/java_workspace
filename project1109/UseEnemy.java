class UseEnemy {
	public static void main(String[] args) {
		//���� 3������ �����, ���� �ٸ� ������ ���� �¾��
		//Enemy(String name, int x, int y, int widght, heigth)
		Enemy e1=new Enemy("������", 0,0,100,100);
		Enemy e2=new Enemy("e2", 10,0,100,100);
		Enemy e3=new Enemy("e3", 20,0,100,100);
		
		System.out.println("ȣ�� �� �����̸� "+e1.name);
		ControlEnemy control=new ControlEnemy();
		//control.test("���ƾƤ��� �� ū�ϳ��� �ʹ� �ӻ��ؤ������������� ��û�̾� �������ƾƤ��Ƥ��Ƥ��ƾƾƾƤ��ƾƾƾ�");  //ȣ��
		control.changeEnemy(e1);  //call by reference
		System.out.println("ȣ�� �� �����̸� "+e1.name);
	}

		//public void changeEnemy(Enemy e){// Enemy e = e1 ( �ּ�);
		//e.name="������";
		//�Լ��� ȣ���� �� ��������
		//�Լ��� ������ ���� �Ű�����
		//�������ڰ� �Ű������� ��
	//} 
}
