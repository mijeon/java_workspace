/*�ڹپ𿡼��� ����� �̺�Ʈ ó�� �� Ŭ�� ���� �̺�Ʈ�� �н���*/
package com.edu.guiproject.event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;

class ActionTest extends Frame {
	Button bt;
	public ActionTest(){
		Button bt=new Button("��ư");
		
		setLayout(new FlowLayout());
		add(bt);
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ActionTest();
	}
}
