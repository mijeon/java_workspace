/*String Ŭ������ ���� �˾ƺ���*/
class  StringTest{
	public static void main(String[] args){		
		//String ��ü��  new �����ڸ� ����Ͽ� �ν��Ͻ��� ������ ���
		//heap ������ �״�� �ö� (��Ģ���)
		String s1=new String("korea");
		String s2=new String("korea");
		System.out.println(s1==s2);  //false; ���۷��� ������ �ּҰ� ���ϹǷ� ���� �ٸ� �ּҰ��� ����Ŵ
		

		//�׷���, �Ͻ���(������) ���������� String�� ������ ���
		//���Ǯ(Constant Pool) ������ �ߺ� �������� ����
		//�� �Ͻ��� �������� ���󵵰� �ʹ� ���Ƽ�, �޸� ������ ����� ��
		String s3="peru";
		String s4="peru";
		System.out.println(s3==s4);  //true; ���Ǯ�� �񱳸� �ϱ� ������ ���� �ּҰ��� ����Ŵ
	}
}
