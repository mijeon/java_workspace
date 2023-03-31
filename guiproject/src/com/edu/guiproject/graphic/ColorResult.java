package com.edu.guiproject.graphic;
import javax.swing.*;
import java.awt.Color;

class ColorResult extends JFrame{
	JPanel p;
	public ColorResult(){
		p=new JPanel();
		p.setBackground(Color.gray);
		add(p);  //ºÎÂø
		setSize(200, 200);
		setVisible(true);
	}
}
