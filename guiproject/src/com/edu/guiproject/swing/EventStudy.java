/*이벤트 처리 과정 복습*/
package com.edu.guiproject.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventStudy extends JFrame implements ActionListener, WindowListener {
	JButton bt1;
	JButton bt2;
	JCheckBox ch;

	public EventStudy(){
		bt1=new JButton("red");
		bt2=new JButton("blue");
		ch=new JCheckBox("수신");
		
		setLayout(new FlowLayout());  //default : BoldLayout

		add(bt1);
		add(bt2);
		add(ch);

		setSize(300, 400);
		setVisible(true);

		//윈도우 x 눌러 창 닫을 때, 프로세스까지 종료 //내가 프레임이기 때문에 JFrame. 생략가능 (static 영역에 올라가 있음)
		setDefaultCloseOperation(EXIT_ON_CLOSE);  

		//버튼들과 리스너 연결
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		//체크박스에도 리스너 연결
		ch.addActionListener(this);
		
		//윈도우리스너는 윈도우에 연결해야함
		//윈도우.addWindowListener
		this.addWindowListener(this);  //내가 윈도우이기 때문에 this는 생략 가능함
		
	}
	public void actionPerformed(ActionEvent e){
		//System.out.println(e);
		//이벤트를 일으킨 컴포넌트를 가르켜, 이벤트소스(일으킨자)라고 함
		Object obj=e.getSource();  //일으킨자를 얻어오기, 기존에 있는걸 알아맞춤 //주소값은 JButton이지만 부모를 사용할 수 있으므로 형변환 후 사용

		//비록 Object 최상위 자료형이지만, 자식에 의해 생성된 부모인스턴스들은, 
		//군집화되어 자식의 주소값에 포함되므로, 어차피 obj 주소값은 bt1이거나, 
		//bt2의 주소값임, 따라서 주소값만 비교할 경우 굳이, JButton으로 형변환할 필요가 없음
		//getSource()를 얻어온 후,  그럼 형변환은 언제 해야하는가?
		//Object형은 가진게 별로 없으므로, 개발자가 원하는 효과를 낼 수 있는 메서드를 가진 하위 객체로 형변환해야 함
		JButton btn=(JButton)obj;  //하위 인스턴스가 가진 메서드를 사용하기 위해 형변환해줌
		
		if (obj==bt1){
			System.out.println("빨간버튼 눌렀어");
			btn.setBackground(Color.pink);

		}else if(obj==bt2){
			System.out.println("파란버튼 눌렀어");
			btn.setBackground(Color.green);
		}
	}

	public void windowActivated(WindowEvent e){
		System.out.println("windowActivated 눌렀어");
	}

	public void windowClosed(WindowEvent e){
		System.out.println("windowClosed 눌렀어");
	}	

	public void windowClosing(WindowEvent e){
		System.out.println("windowClosing 눌렀어");
	}

	public void windowDeactivated(WindowEvent e){
		System.out.println("windowDeactivated 눌렀어");
	}

	public void windowDeiconified(WindowEvent e){
		System.out.println("windowDeiconified 눌렀어");
	}

	public void windowIconified(WindowEvent e){
		System.out.println("windowIconified 눌렀어");
	}

	public void windowOpened(WindowEvent e){
		System.out.println("windowOpened 눌렀어");
	}

	public static void main(String[] args) {
		new EventStudy();
	}
}
