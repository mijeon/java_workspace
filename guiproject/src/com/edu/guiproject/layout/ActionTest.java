/*자바언에서의 사용자 이벤트 처리 중 클릭 관련 이벤트를 학습함*/
package com.edu.guiproject.event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.TextField;

class ActionTest extends Frame implements ActionListener, KeyListener{
	Button bt;
	TextField t;
	

	public ActionTest(){
		bt=new Button("버튼");
		t=new TextField(20);  //열 수를 20자 크기로	
		
		setLayout(new FlowLayout());
		add(bt);
		add(t);
		setSize(200, 200);
		setVisible(true);

		//버튼에 리스너 연결
		bt.addActionListener(this);  //내가 리스너 객체

		//텍스트 필드와 리스너 연결
		t.addKeyListener(this);
	}

	//아래의 메서드는 action 이벤트 발생 시 호출되어짐
	public void actionPerformed(ActionEvent e){
		System.out.println(e);
	}

	//KeyListener가 보유한 추상메서드들 제정의하기
	public void keyPressed(KeyEvent e){
		System.out.println("keyPressed Called");
	}

	public void	keyReleased(KeyEvent e){
		System.out.println("keyReleased Called");
	}

	public void	keyTyped(KeyEvent e){
		System.out.println("keyTyped Called");
	}

	public static void main(String[] args) {
		new ActionTest();
	}
}
