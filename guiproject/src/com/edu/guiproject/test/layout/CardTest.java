package test.layout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

class CardTest extends Frame {
	//�ɹ����� ����
	Panel p_north, p_center;
	Button bt_board, bt_member, bt_login, bt_cs;
	Panel p_board, p_member, p_login, p_cs;
	CardLayout card;
	
	//�����ڸ޼��� ����, �ʱ�ȭ
	public CardTest(){
		p_north=new Panel();
		p_center=new Panel();
		bt_board=new Button("�Խ���");
		bt_member=new Button("ȸ������");
		bt_login=new Button("�α���");
		bt_cs=new Button("������");

		p_board=new Panel();
		p_member=new Panel();
		p_login=new Panel();
		p_cs=new Panel();

		//CardLayout ����
		//setLayout(card=new CardLayout());
		p_center.setLayout(card = new CardLayout());

		//�гο� ������ ����
		p_board.setBackground(Color.lightGray);
		p_member.setBackground(Color.pink);
		p_login.setBackground(Color.cyan);
		p_cs.setBackground(Color.	blue);

		//�гο� ��ư ����
		p_north.add(bt_board);
		p_north.add(bt_member);
		p_north.add(bt_login);
		p_north.add(bt_cs);

		//��ư�� ������ �г��� ���ʿ� ����
		add(p_north, BorderLayout.NORTH);
		add(p_center);

		//CardLayout�� ī����� ������
		p_center.add(p_board);  //CENTER�� ����Ʈ�̹Ƿ� ��������
		p_center.add(p_member);
		p_center.add(p_login);
		p_center.add(p_cs);

		//������ �г�(ī��) �� ���� ī�� �����ֱ�
		card.next(p_center);
		card.next(p_center);
		
		
		//�������� ũ��, ���̰� ����
		setSize(500, 450);
		setVisible(true);
	}
	public static void main(String[] args) {
		//����� �����ڸ޼��带 ȣ�� �� ����
		new CardTest();
	}
}
