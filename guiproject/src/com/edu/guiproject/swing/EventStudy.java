/*�̺�Ʈ ó�� ���� ����*/
package com.edu.guiproject.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventStudy extends JFrame implements ActionListener, WindowListener {
	JButton bt1;
	JButton bt2;
	JCheckBox ch;

	public EventStudy(){
		bt1=new JButton("red");
		bt2=new JButton("blue");
		ch=new JCheckBox("����");
		
		setLayout(new FlowLayout());  //default : BoldLayout

		add(bt1);
		add(bt2);
		add(ch);

		setSize(300, 400);
		setVisible(true);

		//������ x ���� â ���� ��, ���μ������� ���� //���� �������̱� ������ JFrame. �������� (static ������ �ö� ����)
		setDefaultCloseOperation(EXIT_ON_CLOSE);  

		//��ư��� ������ ����
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		//üũ�ڽ����� ������ ����
		ch.addActionListener(this);
		
		//�����츮���ʴ� �����쿡 �����ؾ���
		//������.addWindowListener
		this.addWindowListener(this);  //���� �������̱� ������ this�� ���� ������
		
	}
	public void actionPerformed(ActionEvent e){
		//System.out.println(e);
		//�̺�Ʈ�� ����Ų ������Ʈ�� ������, �̺�Ʈ�ҽ�(����Ų��)��� ��
		Object obj=e.getSource();  //����Ų�ڸ� ������, ������ �ִ°� �˾Ƹ��� //�ּҰ��� JButton������ �θ� ����� �� �����Ƿ� ����ȯ �� ���

		//��� Object �ֻ��� �ڷ���������, �ڽĿ� ���� ������ �θ��ν��Ͻ�����, 
		//����ȭ�Ǿ� �ڽ��� �ּҰ��� ���ԵǹǷ�, ������ obj �ּҰ��� bt1�̰ų�, 
		//bt2�� �ּҰ���, ���� �ּҰ��� ���� ��� ����, JButton���� ����ȯ�� �ʿ䰡 ����
		//getSource()�� ���� ��,  �׷� ����ȯ�� ���� �ؾ��ϴ°�?
		//Object���� ������ ���� �����Ƿ�, �����ڰ� ���ϴ� ȿ���� �� �� �ִ� �޼��带 ���� ���� ��ü�� ����ȯ�ؾ� ��
		JButton btn=(JButton)obj;  //���� �ν��Ͻ��� ���� �޼��带 ����ϱ� ���� ����ȯ����
		
		if (obj==bt1){
			System.out.println("������ư ������");
			btn.setBackground(Color.pink);

		}else if(obj==bt2){
			System.out.println("�Ķ���ư ������");
			btn.setBackground(Color.green);
		}
	}

	public void windowActivated(WindowEvent e){
		System.out.println("windowActivated ������");
	}

	public void windowClosed(WindowEvent e){
		System.out.println("windowClosed ������");
	}	

	public void windowClosing(WindowEvent e){
		System.out.println("windowClosing ������");
	}

	public void windowDeactivated(WindowEvent e){
		System.out.println("windowDeactivated ������");
	}

	public void windowDeiconified(WindowEvent e){
		System.out.println("windowDeiconified ������");
	}

	public void windowIconified(WindowEvent e){
		System.out.println("windowIconified ������");
	}

	public void windowOpened(WindowEvent e){
		System.out.println("windowOpened ������");
	}

	public static void main(String[] args) {
		new EventStudy();
	}
}
