/*자바의 모든 컴포넌트는 스스로를 그림
특히, 그림을 그리는 행동은 paint() 메서드가 결정하고,
색상, 스타일 등은 paint()  메서드의 인수인 Graphics 객체가 담당함*/
package com.edu.guiproject.graphic;
import javax.swing.*;
import java.awt.Canvas;

class PaintButton extends JFrame {
	//JButton bt;
	CustomButton bt;
	//자바의 GUI 컴포넌트 중 도화지를 표현한 객체
	//따라서 개발자는 Canvas의 paint() 메서드를 재정의하여
	//원하는 그림을 그리기에 적절한 객체
	XCanvas can;
	
	public PaintButton(){
		//setLayout(new java.awt.FlowLayout());
		//bt=new JButton("버튼");
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
