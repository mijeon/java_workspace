/*���̾ƿ� �� CardLayout�� �н���*/
package com.edu.guiproject.layout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

class CardTest extends Frame {
	//�ɹ����� ����
	Panel p_north;
	Button bt_board, bt_member, bt_login, bt_cs;
	Panel p_board, p_member, p_login, p_cs;
	CardLayout card;
	
	//�����ڸ޼��� ����, �ʱ�ȭ
	public CardTest(){
		p_north=new Panel();
		bt_board=new Button("�Խ���");
		bt_member=new Button("ȸ������");
		bt_login=new Button("�α���");
		bt_cs=new Button("������");

		p_board=new Panel();
		p_member=new Panel();
		p_login=new Panel();
		p_cs=new Panel();
		
		//CardLayout �� ���̾ƿ� ��ü
		//��ü���̾ƿ��� ���� �����Ǿ�� ���� ����� �����
		setLayout(card=new CardLayout());  

		//�гο� ������ ����
		p_board.setBackground(Color.pink);
		p_member.setBackground(Color.blue);
		p_login.setBackground(Color.cyan);
		p_cs.setBackground(Color.magenta);

		//�гο� ��ư ����
		p_north.add(bt_board);
		p_north.add(bt_member);
		p_north.add(bt_login);
		p_north.add(bt_cs);

		//��ư�� ������ �г��� ���ʿ� ����
		add(p_north, BorderLayout.NORTH);

		//CardLayout�� ī����� ������
		add(p_board);  
		add(p_member);
		add(p_login);
		add(p_cs);

		//���Ϳ� ������ �г�(ī��) �� ���� ī�� �����ֱ�
		//card.last(this);
		card.next(this);
		card.next(this);
		
		//�������� ũ��, ���̰� ����
		setSize(500, 450);
		setVisible(true);
	}


	public static void main(String[] args) {
		new CardTest();  //����� �����ڸ޼��带 ȣ�� �� ����
	}
}
