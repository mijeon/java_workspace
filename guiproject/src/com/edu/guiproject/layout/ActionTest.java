/*�ڹپ𿡼��� ����� �̺�Ʈ ó�� �� Ŭ�� ���� �̺�Ʈ�� �н���*/
package com.edu.guiproject.event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.TextField;

class ActionTest extends Frame implements ActionListener, KeyListener{
	Button bt;
	TextField t;
	

	public ActionTest(){
		bt=new Button("��ư");
		t=new TextField(20);  //�� ���� 20�� ũ���	
		
		setLayout(new FlowLayout());
		add(bt);
		add(t);
		setSize(200, 200);
		setVisible(true);

		//��ư�� ������ ����
		bt.addActionListener(this);  //���� ������ ��ü

		//�ؽ�Ʈ �ʵ�� ������ ����
		t.addKeyListener(this);
	}

	//�Ʒ��� �޼���� action �̺�Ʈ �߻� �� ȣ��Ǿ���
	public void actionPerformed(ActionEvent e){
		System.out.println(e);
	}

	//KeyListener�� ������ �߻�޼���� �������ϱ�
	public void keyPressed(KeyEvent e){
		System.out.println("keyPressed Called");
	}

	public void	keyReleased(KeyEvent e){
		System.out.println("keyReleased Called");
	}

	public void	keyTyped(KeyEvent e){
		System.out.println("keyTyped Called");
	}

	public static void main(String[] args) {
		new ActionTest();
	}
}
