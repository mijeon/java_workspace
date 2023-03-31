package com.edu.guiproject.event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class ChatA extends Frame implements ActionListener, KeyListener {
	//�ɹ����� ���� has a
	Button bt_create;  //ģ�� ���� ��ư
	TextArea area;  //ä�� ��� �α�â
	Panel p_south;  //���� ������ �г�
	TextField t_input;  //�޼��� �Է�â
	Button bt_send;  //���۹�ư
	ChatB cb;  //���� null  //�����Ϸ��� �ɹ������� ���� ////has a ����� ���� �����ϱ� ���� �ɹ������� ����

	//�����ڸ޼��� �ȿ� �ν��Ͻ� �ο�
	public ChatA(){
		super("ChatA");
		bt_create=new Button("ģ������");
		area=new TextArea();
		p_south=new Panel();
		t_input=new TextField(20);
		bt_send=new Button("����");

		//��ü �����ӿ� ������ ���� = chatA
		add(bt_create, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);  //default : BorderLayout.CENTER ��������
		p_south.add(t_input);  //�гο� �Է��ʵ� ����
		p_south.add(bt_send);  //�гο� ���۹�ư ����
		add(p_south, BorderLayout.SOUTH);

		//������ ���� 
		setBounds(200, 100, 300, 400);  //setBounds(x, y, width, height)
		setVisible(true);

		//��ư�� ������ ����
		bt_create.addActionListener(this);  //is a ���谡 �����ż� this=ActionListener
		
		//�Է��ʵ�� ������ ����
		t_input.addKeyListener(this);

		
	}

	//ActionListener�� ������ �߻�޼��� �������̵�(������)
	public void actionPerformed(ActionEvent e){
		System.out.println("ģ�� �����Ұž�");
		cb=new ChatB(this);  //������ ChatA�� �ּҸ� �־���  //�ɹ��� �ν��Ͻ� ���� �� �ּҰ� �ο�
	}

	//KeyListener�� ������ �߻�޼��� �������̵�(������) 
	public void keyPressed(KeyEvent e){  //���� ��  //�޼���� �ҹ��ڷ� �ۼ�
		//System.out.println(e.getKeyCode());
		if(e.getKeyCode()==KeyEvent.VK_ENTER){  //VK_ENTER : ���
			System.out.println("�����ƾ�?");

			//area�� �ؽ�Ʈ �߰�����(��üx)
			String msg=t_input.getText();
			area.append("��: "+msg+"\n");

			//ģ�� B�� area���� �߰�
			if(cb != null){
			cb.area.append("A : "+msg+"\n");
			}
		
			t_input.setText("");  //�Է�â ����
		}
	}  

	public void keyReleased(KeyEvent e){  //������ �� ��

	}

	public void keyTyped(KeyEvent e){  //Ű���� �Է� ��

	}

	public static void main(String[] args) {	
		new ChatA();
	}
}
