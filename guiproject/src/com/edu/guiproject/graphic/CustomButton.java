/*
컴포넌트는 스스로를 그리는데, 만일 그 그림을 개발자가 주도하려면 (그림을 뺐어서 그림) 
버튼뿐만 아니라 모든 GUI 컴포넌트가 공통적으로 보유한 paint()라는 메서드를 재정의하면 됨 
*/
package com.edu.guiproject.graphic;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;

class CustomButton extends JButton {
	//버튼의 paint()를 재정의해보자
	public CustomButton(){
		this.setBackground(Color.red);
	}
	public void paint(Graphics g){
		System.out.println("그림을 뺐어 그림");
		g.drawLine(0, 0, 20, 10);
	}
}
