package com.edu.guiproject.event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class ChatA extends Frame implements ActionListener, KeyListener {
	//맴버변수 생성 has a
	Button bt_create;  //친구 생성 버튼
	TextArea area;  //채팅 기록 로그창
	Panel p_south;  //남쪽 영역의 패널
	TextField t_input;  //메세지 입력창
	Button bt_send;  //전송버튼
	ChatB cb;  //현재 null  //제어하려고 맴버변수로 선언 ////has a 관계로 만들어서 제어하기 위해 맴버변수로 선언

	//생성자메서드 안에 인스턴스 부여
	public ChatA(){
		super("ChatA");
		bt_create=new Button("친구생성");
		area=new TextArea();
		p_south=new Panel();
		t_input=new TextField(20);
		bt_send=new Button("전송");

		//전체 프레임에 공간을 나눔 = chatA
		add(bt_create, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);  //default : BorderLayout.CENTER 생략가능
		p_south.add(t_input);  //패널에 입력필드 부착
		p_south.add(bt_send);  //패널에 전송버튼 부착
		add(p_south, BorderLayout.SOUTH);

		//윈도우 설정 
		setBounds(200, 100, 300, 400);  //setBounds(x, y, width, height)
		setVisible(true);

		//버튼에 리스너 연결
		bt_create.addActionListener(this);  //is a 관계가 성립돼서 this=ActionListener
		
		//입력필드와 리스너 연결
		t_input.addKeyListener(this);

		
	}

	//ActionListener가 보유한 추상메서드 오버라이딩(재정의)
	public void actionPerformed(ActionEvent e){
		System.out.println("친구 생성할거야");
		cb=new ChatB(this);  //기존의 ChatA의 주소를 넣어줌  //맴버의 인스턴스 생성 후 주소값 부여
	}

	//KeyListener가 보유한 추상메서드 오버라이딩(재정의) 
	public void keyPressed(KeyEvent e){  //누를 때  //메서드는 소문자로 작성
		//System.out.println(e.getKeyCode());
		if(e.getKeyCode()==KeyEvent.VK_ENTER){  //VK_ENTER : 상수
			System.out.println("엔터쳤어?");

			//area에 텍스트 추가하자(대체x)
			String msg=t_input.getText();
			area.append("나: "+msg+"\n");

			//친구 B의 area에도 추가
			if(cb != null){
			cb.area.append("A : "+msg+"\n");
			}
		
			t_input.setText("");  //입력창 비우기
		}
	}  

	public void keyReleased(KeyEvent e){  //눌러다 땔 때

	}

	public void keyTyped(KeyEvent e){  //키보드 입력 시

	}

	public static void main(String[] args) {	
		new ChatA();
	}
}
