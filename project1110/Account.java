/*
������� ����
���������� : �ڹ��� Ŭ����, �޼���, ������ ���� ������ �� �ִ��� ���θ� �������� ���
public < protected < default < private 
public : ����ó�� X
protected : ��Ӱ����� ��ü�� ���� ����
default : ���� ���丮(��Ű��) ���� Ŭ������ ���� ����, ����Ʈ�� ������� ����
private : �� �ڽŸ� ���� ���� (�ܺ� ���� ����)

Envapsulation(ĸ��ȭ) = ����ȭ
����ȭ��? �ɹ������� private �����Ͽ� �������� �ܺ��� ������ ����, �̺����鿡 ����
����� getter/setter �޽��带 ���� ������ִ� Ŭ���� ���� ���
*/

//default�� project1110�� ���� ����
class  Account{  //Ŭ���� ���� ��� : ����+�Լ�
	private int balance;  //�ܰ�
	private String owner;  //������
	private String bankName;  //�����
	
	//getter
	public int getBalance(){
		return balance;
	}

	public String getOwner(){
		return owner;
	}
	public String getBankName(){
		return bankName;
	}
	
	//setter
	public void setBalance(int balance){
		this.balance=balance;
	}
	public void setOwner(String owner){
		this.owner=owner;
	}
	public void setBankName(String bankname){
		this.bankName=bankName;
	}
}
