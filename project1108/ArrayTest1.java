/*
��� ���� �迭�� �����Ǹ�, ������ ��� ����
�ణ�� ���� ǥ���� Ʋ��
����) js�� �����庮�� ���� ������ �迭 ���� �� ũ�⸦ �������
�ʾƵ� �Ǿ�����, c, java, c# ��� ���� �Ϲ����� ���� ���α׷�
������ �迭 ���� �� �ݵ�� �� ũ�⸦ ����ؾ� ��
*/
class  ArrayTest1{
	public static void main(String[] args) {
		//�ڹ��� ��� �ڷ��� ���� �迭�� ������
		//byte, short, int, long
		//char
		//float, double
		/*
		byte[] b=new byte[3];
		System.out.println("�迭�� ũ��� " + b.length);
		*/
		char[] c=new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		//�ڹٿ����� ��� �Ǽ��� double�� ó����
		//����, float�� ����ϰ� �ʹٸ�, float������ ����ؾ� ��
		float k=3.14f+0.23f;

		//String�� ��ü������, ���󵵰� �ʹ� ���� ������
		//new �����ڿ� ������ �ʰ� ��ġ �Ϲ� ������Ÿ��ó��
		//������ �� �ִ� ������(�Ͻ���) �������� ������

		//����� ������ - explicit
		String s=new String("Korea");  

		//������(�Ͻ���) - implicit
		String s2="Korea";  //�Ͻ���(�巯���� �ʰ� ����)

		String [] fruit=new String[3];

		//�����ϴ� ���� 3�� ���, �ݺ������� ���
		fruit[0]="banana";
		fruit[1]="apple";
		fruit[2]="orange";

		for(int i=0;i<fruit.length;i++){
			System.out.println(fruit[i]);
		}
	}
}
