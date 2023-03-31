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

class ChatB extends Frame implements KeyListener { 
	//�ɹ����� ���� has a
	TextArea area;  //ä�� ��� �α�â
	Panel p_south;  //���� ������ �г�
	TextField t_input;  //�޼��� �Է�â
	Button bt_send;  //���۹�ư
	ChatA ca;  //ChatA ca �ɹ��� �ν��Ͻ� ���� �� �ּҰ� �ο�

	//�����ڸ޼��� ���� �� �ʱ�ȭ
	public ChatB(ChatA ca){  //new ChatB(�ν��Ͻ�)  ChatB���� ChatA�� �����Ϸ��� �̹� ������ ChatA �ν��Ͻ��� �����ؾ��Ѵ�
		super("ChatB");
		area=new TextArea();
		p_south=new Panel();
		t_input=new TextField(20);
		bt_send=new Button("����");	
		this.ca=ca;  

		//����
		add(area, BorderLayout.CENTER);  //default : BorderLayout.CENTER ��������
		p_south.add(t_input);  //�гο� �Է��ʵ� ����
		p_south.add(bt_send);  //�гο� ���۹�ư ����
		add(p_south, BorderLayout.SOUTH);

		//������ ���� 
		setBounds(500, 100, 300, 400);  //setBounds(x, y, width, height)
		setVisible(true);
		
		//�Է��ʵ�� ������ ����
		t_input.addKeyListener(this);
	}


	//KeyListener�� ������ �߻�޼��� �������̵�(������) 
	//�޼���� �ҹ��ڷ� �ۼ�
	public void keyPressed(KeyEvent e){  //���� ��  
		//System.out.println(e.getKeyCode());

		if(e.getKeyCode()==KeyEvent.VK_ENTER){  //VK_ENTER : ���
			System.out.println("�����ƾ�?");

			//area�� �ؽ�Ʈ �߰�����(��üx)
			String msg=t_input.getText();
			area.append("�� : "+msg+"\n");
			
			//ChatA�� area
			ca.area.append("B : "+msg+"\n");

			t_input.setText("");  //�Է�â ����
		}
	}  

	public void keyReleased(KeyEvent e){  //������ �� ��

	}

	public void keyTyped(KeyEvent e){  //Ű���� �Է� ��

	}//b�� �� ������ ����?
}
