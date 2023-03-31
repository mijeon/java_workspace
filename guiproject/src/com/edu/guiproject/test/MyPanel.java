package com.edu.guiproject.test;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Image;

class MyPanel extends JPanel {
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image img;
	Gallery gallery;
	String[] imgName={"abc.jfif","amgy.jfif","api.jfif","bbnj.jfif","ccv.jfif","eert.jfif","kko.jfif","mop.jfif", "ney.jfif", "rrt.jfif"};
	int index=0;

	public MyPanel(Gallery gallery){
		this.gallery=gallery;
		createImage();
	}
	public void createImage(){
		img=kit.getImage("C:/java_workspace/guiproject/res/sea/"+imgName[index]);	
	}
	//paint() 메서드 재정의
	public void paint(Graphics g){
		//drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)
		g.drawImage(img, 0, 0, 490, 490, gallery);
	}
}
