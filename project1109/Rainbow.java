/*������ ������ �������� ����ϴ� Ŭ������ ����*/
class Rainbow {
	//�ڹٴ� �迭 ���� �� �� ũ�⸦ ����ؾ� ��
	//js�� ũ�⸦ ������� �ʾƵ� ����ó�� �þ �� ������, java�� �迭�� �Ұ�����
	String[] color=new String[7];

	public Rainbow(){
		//������ ä����
		color[0]="red";
		color[1]="orange";
		color[2]="yellow";
		color[3]="green";
		color[4]="blue";
		color[5]="navy";
		color[6]="purple";
		
		//UtilObj util=new UtilObj();  //�ν��Ͻ� ����
		//int n=util.getRandom();
		

		//��ƿŬ������ �����Լ����� �����ͼ� �Ʒ��� �迭 �ε��� �ڸ��� �ֱ�
		//getRandom() �޼���� �ν��Ͻ� �޼����̹Ƿ�, UtilObj() Ŭ������
		//�ν��Ͻ��� ������ �Ŀ� ��� ����
		int n=UtilObj.getRandom();  //static ���� ��
		System.out.println(color[n]);  
		//System.out.println(color[new UtilObj().getRandom()]) ���� ���Ե� ����
		//System.out.println(color[1]);  
	}

	public static void main(String[] args) {
		new Rainbow();  //Rainbow�� ������ ��
		
	}
}
