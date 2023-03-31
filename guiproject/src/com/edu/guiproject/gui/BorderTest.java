package gui;
import java.awt.*;

class BorderTest extends Frame {  //extens : is a
	Button bt_north, bt_west, bt_east, bt_south, bt_center;  //has a
	BorderLayout border;  //��, ��, ��, ��, ������ ������ ���� ��ġ������
	Button bt_login;  //�α��� ��ư
	Button bt_regist;  //���� ��ư

	//�ϳ��� ������Ʈ���� �ݵ�� �� ������ ���̾ƿ��� ������ �� ����
	//���� �츮�� ���� ������� Frame���� �̹� BoderLayout��
	//������ �����̹Ƿ� �ٸ� ���̾ƿ��� ���ÿ� ������ �� ���� 
	//��, �����Ӿȿ��� ���̾ƿ� ������ ������ ������Ʈ�� ����ϸ�
	//�κ������� ���̾ƿ��� ���ϴ� ������ ������
	//�̶� ���� ���Ǵ� ������Ʈ�� �ٷ� Panel(����)��
	Panel p;  //���� ���� ��絵 ���� (div�� ���)
				 //����Ʈ�� FlowLayout �� �����

	public BorderTest(){
		//�޸𸮿� �ø���
		bt_north=new Button("NORTH");
		bt_west=new Button("WEST");
		bt_east=new Button("EAST");
		bt_south=new Button("SOUTH");
		bt_center=new Button("CENTER");
		border=new BorderLayout();
		bt_login=new Button("�α���");  
		bt_regist=new Button("ȸ������");
		p=new Panel();  //���� ����
		p.setBackground(Color.PINK);  //���� �Ⱥ��̹Ƿ�, ������ ��


		this.setLayout(border);  //���̾ƿ� ����, ��������
		//��� Frame�� �����ڰ� �ƹ��� ��ġ�����ڸ� �������� ������, ����Ʈ�� 
		//BorderLayout�� �����
	
		p.add(bt_login);  //���ڿ� �α��� ��ư ����
		p.add(bt_regist);  //���ڿ����� ��ư ����

		//��ư ����
		add(bt_north, BorderLayout.NORTH);  //(, ����) //���ʿ� ��ư ����
		add(bt_west, BorderLayout.WEST);  //(, ����) //���ʿ� ��ư ����
		add(p, BorderLayout.CENTER);  //(, ����) //���Ϳ� ��ư ���� -> ���� ����
		add(bt_east, BorderLayout.EAST);  //(, ����) //���ʿ� ��ư ����
		add(bt_south, BorderLayout.SOUTH);  //(, ����) //���ʿ� ��ư ����

		setSize(500, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderTest();  //���������� ������ ��� ���� ��� X
	}
}
