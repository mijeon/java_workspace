package com.adu.guiproject.swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

//AWT�� OS���� �������� ������������, swing�� �������� look&Feel�� ����
//������ ������ �ͼ����� ���� UI�� ���� ���� ����
//�̸� ������ JavaFX�� ���
//swing�� ����Ѵ� �ϴ��� ������ awt�� �Ⱦ��°� �ƴ�
//awt �� ���̾ƿ��Ŵ���, �̺�Ʈ ���� ������ ���� (��� : �����)
class SwingTest extends JFrame{
	JButton bt;
	JTextField t;

	//������ ����
	public SwingTest(){
		setLayout(new java.awt.FlowLayout());
		add(bt=new JButton("������ư"));
		add(t=new JTextField(15));
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingTest();
	}
}
