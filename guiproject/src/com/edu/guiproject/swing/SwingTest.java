package com.adu.guiproject.swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

//AWT는 OS마다 종속적인 디자인이지만, swing은 독자적인 look&Feel을 가짐
//하지만 오히려 익숙하지 않은 UI로 욕을 많이 먹음
//이를 개선한 JavaFX가 출시
//swing을 사용한다 하더라도 완전히 awt를 안쓰는게 아님
//awt 중 레이아웃매니저, 이벤트 등은 여전히 사용됨 (결론 : 섞어쓰자)
class SwingTest extends JFrame{
	JButton bt;
	JTextField t;

	//생성자 정의
	public SwingTest(){
		setLayout(new java.awt.FlowLayout());
		add(bt=new JButton("스윙버튼"));
		add(t=new JTextField(15));
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingTest();
	}
}
