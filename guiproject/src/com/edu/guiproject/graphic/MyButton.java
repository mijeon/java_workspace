/*������ �� ������ ���� ���������� �ٲٱ� ���� ������ ��ư 
   (Ŀ���� ��ư) : ���뼺 ����*/
package com.edu.guiproject.graphic;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;

class MyButton extends JButton{
	public MyButton(Color color){
		setPreferredSize(new Dimension(50, 50));  //�ʺ�, ����
		setBackground(color);
		//setBackground(new Color());  //rgb�÷� ���� ��� new ������ ���
	}
}
