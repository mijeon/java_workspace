/*�䳢�� ������*/
public class  Rabbit{
	String color="white";
	int age=10;
	public static final int LEGS=4;  //������ �ƴ��� �����ϱ� ���� �빮�� ���

	/**
	���� ���� �䳢�� ������
	*/
	public Rabbit(){
		
	}

	/**
	�䳢�� �� ������ �ٴ� �޼���
	*/
	public void jump(){
		System.out.println("���ѱ���");
	}

	public static void main(String[] args){
		int age=7;  //main() �ȿ� �ִ� �Ӽ����� Ŭ������ �Ӽ��� �������
		Rabbit r=new Rabbit();
		Rabbit r2=new Rabbit();
		//System.out.println(age);
	}
}
