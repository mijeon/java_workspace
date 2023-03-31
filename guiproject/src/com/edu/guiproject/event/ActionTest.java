/*자바언에서의 사용자 이벤트 처리 중 클릭 관련 이벤트를 학습함*/
package com.edu.guiproject.event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;

class ActionTest extends Frame {
	Button bt;
	public ActionTest(){
		Button bt=new Button("버튼");
		
		setLayout(new FlowLayout());
		add(bt);
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionTest();
	}
}
