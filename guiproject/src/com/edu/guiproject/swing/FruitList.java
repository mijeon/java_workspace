/*콤보박스에서 넘어오는 데이터를 목록화 시키기 위한 친구클래스
comboTest가 실행하므로 main() 선언 x*/
package com.edu.guiproject.swing;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class FruitList extends JFrame implements ActionListener{
	JButton bt_del;  //상대방의 area 삭제
	JTextArea area;
	ComboTest ct;  //나를 불러준 원본 클래스

	public FruitList(){
		bt_del=new JButton("상대방 삭제");
		area=new JTextArea();

		add(bt_del, BorderLayout.NORTH);
		add(area);  //BorderLayout.CENTER는 디폴트이므로 생략가능

		//setLayout(new java.awt.FlowLayout());

		setSize(300, 400);
		setVisible(true);

		//버튼과 리스너 연결
		bt_del.addActionListener(this);
	}

	//이 메서드로 ComboTest를 넘겨받아, 맴버변수에 선언된 ct에 대입하기
	public void setCombo(ComboTest ct){  //3) ComboTest ct는 ComboTest 클래스에서 매개변수로 잡은 this를 넣어주기 위해 선언
		this.ct=ct;  //4) call by reference(원본에 영향을 미친다. 여기서 넣어주면 멤버에 계속 들어가있는다.)
	}
	public void actionPerformed(ActionEvent e){
		//상대방의 area의 데이터 삭제
		ct.area.setText("");
	}
}
