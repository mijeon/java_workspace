package com.edu.guiproject.test; 
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Toolkit;

class MyPanel extends JPanel{
	//�ڹ� gui���� �̹����� Toolkit Ŭ�����κ��� �ν��Ͻ��� ���� �� ����
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image img;

	public MyPanel(){
		img=kit.
	}
	//paint() �޼��� ������
	public void paint(Graphics g){
		//drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
		g.drawImage();
	}
}
