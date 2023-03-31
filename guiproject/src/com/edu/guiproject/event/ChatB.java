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

class ChatB extends Frame implements KeyListener { 
	//맴버변수 생성 has a
	TextArea area;  //채팅 기록 로그창
	Panel p_south;  //남쪽 영역의 패널
	TextField t_input;  //메세지 입력창
	Button bt_send;  //전송버튼
	ChatA ca;  //ChatA ca 맴버의 인스턴스 생성 후 주소값 부여

	//생성자메서드 정의 및 초기화
	public ChatB(ChatA ca){  //new ChatB(인스턴스)  ChatB에서 ChatA를 제어하려면 이미 생성된 ChatA 인스턴스를 참조해야한다
		super("ChatB");
		area=new TextArea();
		p_south=new Panel();
		t_input=new TextField(20);
		bt_send=new Button("전송");	
		this.ca=ca;  

		//조립
		add(area, BorderLayout.CENTER);  //default : BorderLayout.CENTER 생략가능
		p_south.add(t_input);  //패널에 입력필드 부착
		p_south.add(bt_send);  //패널에 전송버튼 부착
		add(p_south, BorderLayout.SOUTH);

		//윈도우 설정 
		setBounds(500, 100, 300, 400);  //setBounds(x, y, width, height)
		setVisible(true);
		
		//입력필드와 리스너 연결
		t_input.addKeyListener(this);
	}


	//KeyListener가 보유한 추상메서드 오버라이딩(재정의) 
	//메서드는 소문자로 작성
	public void keyPressed(KeyEvent e){  //누를 때  
		//System.out.println(e.getKeyCode());

		if(e.getKeyCode()==KeyEvent.VK_ENTER){  //VK_ENTER : 상수
			System.out.println("엔터쳤어?");

			//area에 텍스트 추가하자(대체x)
			String msg=t_input.getText();
			area.append("나 : "+msg+"\n");
			
			//ChatA의 area
			ca.area.append("B : "+msg+"\n");

			t_input.setText("");  //입력창 비우기
		}
	}  

	public void keyReleased(KeyEvent e){  //눌러다 땔 때

	}

	public void keyTyped(KeyEvent e){  //키보드 입력 시

	}//b는 왜 메인이 없어?
}
