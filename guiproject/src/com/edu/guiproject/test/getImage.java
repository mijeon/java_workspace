package com.edu.guiproject.test; 
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Toolkit;

class MyPanel extends JPanel{
	//자바 gui에서 이미지를 Toolkit 클래스로부터 인스턴스를 얻어올 수 있음
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image img;

	public MyPanel(){
		img=kit.
	}
	//paint() 메서드 재정의
	public void paint(Graphics g){
		//drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
		g.drawImage();
	}
}
