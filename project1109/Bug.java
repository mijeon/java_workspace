class  Bug{
	//modifier(������=������) static : ������, ������
	//static���� ������ ������, �ν��Ͻ� ������ �ش� �ν��Ͻ��� �����ö��� ����
	//��, Ŭ���� ������ ������ ��������, Ŭ���������� ��
	static String type="����";
	String name="��";

	public void fly(){
		System.out.println("����");	
	}

	public static void main(String[] args){
		//mame="����";  //�ν��Ͻ��� �¾�� �ʾ� ���� �Ұ���
		//Bug.type="fish";  //Ŭ���� ������ ���� ����, ���� Ŭ���� ������ Ŭ������ ���� ����

		int age=8;
		Bug b=new Bug();
		System.out.println("age is "+age);
		System.out.println("b is "+b);
	}	

}
