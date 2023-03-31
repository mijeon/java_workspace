/*�޺��ڽ����� �Ѿ���� �����͸� ���ȭ ��Ű�� ���� ģ��Ŭ����
comboTest�� �����ϹǷ� main() ���� x*/
package com.edu.guiproject.swing;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class FruitList extends JFrame implements ActionListener{
	JButton bt_del;  //������ area ����
	JTextArea area;
	ComboTest ct;  //���� �ҷ��� ���� Ŭ����

	public FruitList(){
		bt_del=new JButton("���� ����");
		area=new JTextArea();

		add(bt_del, BorderLayout.NORTH);
		add(area);  //BorderLayout.CENTER�� ����Ʈ�̹Ƿ� ��������

		//setLayout(new java.awt.FlowLayout());

		setSize(300, 400);
		setVisible(true);

		//��ư�� ������ ����
		bt_del.addActionListener(this);
	}

	//�� �޼���� ComboTest�� �Ѱܹ޾�, �ɹ������� ����� ct�� �����ϱ�
	public void setCombo(ComboTest ct){  //3) ComboTest ct�� ComboTest Ŭ�������� �Ű������� ���� this�� �־��ֱ� ���� ����
		this.ct=ct;  //4) call by reference(������ ������ ��ģ��. ���⼭ �־��ָ� ����� ��� ���ִ´�.)
	}
	public void actionPerformed(ActionEvent e){
		//������ area�� ������ ����
		ct.area.setText("");
	}
}
