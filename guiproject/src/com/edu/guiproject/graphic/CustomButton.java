/*
������Ʈ�� �����θ� �׸��µ�, ���� �� �׸��� �����ڰ� �ֵ��Ϸ��� (�׸��� ��� �׸�) 
��ư�Ӹ� �ƴ϶� ��� GUI ������Ʈ�� ���������� ������ paint()��� �޼��带 �������ϸ� �� 
*/
package com.edu.guiproject.graphic;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;

class CustomButton extends JButton {
	//��ư�� paint()�� �������غ���
	public CustomButton(){
		this.setBackground(Color.red);
	}
	public void paint(Graphics g){
		System.out.println("�׸��� ���� �׸�");
		g.drawLine(0, 0, 20, 10);
	}
}
