/*�츮�� ������ Account Ŭ������ ������ ����ȭ�Ǿ� �ִ��� �׽�Ʈ�غ�*/
class UseAccount {
	public static void main(String[] args) {
		Account acc=new Account();
		//acc.balance=700;  //�������� ������ �Ұ���

		//������ �ֱ� (wirte==setter)
		acc.setBalance(100000);
	

		//��ȸ�غ��� (read==getter)
		int balance=acc.getBalance();
		System.out.println("���� �ܰ�� "+balance);
	}
}
