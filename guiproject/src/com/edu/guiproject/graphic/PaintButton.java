/*�ڹ��� ��� ������Ʈ�� �����θ� �׸�
Ư��, �׸��� �׸��� �ൿ�� paint() �޼��尡 �����ϰ�,
����, ��Ÿ�� ���� paint()  �޼����� �μ��� Graphics ��ü�� �����*/
package com.edu.guiproject.graphic;
import javax.swing.*;
import java.awt.Canvas;

class PaintButton extends JFrame {
	//JButton bt;
	CustomButton bt;
	//�ڹ��� GUI ������Ʈ �� ��ȭ���� ǥ���� ��ü
	//���� �����ڴ� Canvas�� paint() �޼��带 �������Ͽ�
	//���ϴ� �׸��� �׸��⿡ ������ ��ü
	XCanvas can;
	
	public PaintButton(){
		//setLayout(new java.awt.FlowLayout());
		//bt=new JButton("��ư");
		//bt=new CustomButton();
		can=new XCanvas();

		//add(bt);
		add(can);
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new PaintButton();
	}
}
