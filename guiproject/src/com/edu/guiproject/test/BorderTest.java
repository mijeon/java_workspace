package test;
import java.awt.*;

class BorderTest extends Frame {
		//�ɹ����� ����
		BorderLayout border;
		Button bt_east, bt_west, bt_south, bt_north, bt_center;
		Button bt_login, bt_regist;
		Panel p;

		//�����ڸ޼��带 �����ϰ� �ʱ�ȭ
	public BorderTest(){
		//�޸𸮿� �ø���
		border=new BorderLayout();
		bt_east=new Button("EAST");
		bt_west=new Button("WEST");
		bt_south=new Button("SOUTH");
		bt_north=new Button("NORTH");
		bt_center=new Button("CENTER");
		bt_login=new Button("�α���");
		bt_regist=new Button("ȸ������");
		p=new Panel();
		p.setBackground(Color.pink);

		this.setLayout(border);

		//��ư ����
		add(bt_east, BorderLayout.EAST);
		add(bt_west, BorderLayout.WEST);
		add(bt_south, BorderLayout.SOUTH);
		add(bt_north, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);

		//�ǳڿ� ��ư ����
		p.add(bt_login);
		p.add(bt_regist);

		//������ ũ��, ���̰� ����
		setTitle("border");
		setSize(500, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//����� �����ڸ޼��带 ȣ�� �� ����
		new BorderTest();
	}
}
