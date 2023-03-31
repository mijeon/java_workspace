package com.edu.guiproject.graphic; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Gallery extends JFrame implements ActionListener{
	JButton bt_prev, bt_next;
	JPanel p_north;
	MyPanel p_center;
	JTextField t_name;
	
	public Gallery(){
		p_north=new JPanel();
		p_center=new MyPanel(this);
		bt_prev=new JButton("이전");
		bt_next=new JButton("다음");
		t_name=new JTextField(25);
		
		//패널에 버튼 부착
		p_north.add(bt_prev);
		p_north.add(t_name);
		p_north.add(bt_next);

		//패널을 북쪽에 부착
		add(p_north, BorderLayout.NORTH);
		//패널을 센터에 부착
		add(p_center);
	

		setSize(500, 550);
		setVisible(true);

		//버튼에 리스너 연결
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
		showImage();  //처음에 파일명 표시를 위해 생성자에 넣어서 초기화 시켜줌
   }
   
   public void actionPerformed(ActionEvent e)   {
		Object obj = e.getSource();  //이미 있는 메소드 사용 시 메소드 안에 어떤 기능이 들어있을지 모르므로 최상위 객체를 명시해줌
												 

		if(obj == bt_prev) {
			if(p_center.index>0){
				System.out.println("이전");
				p_center.index--;
			}else{
				JOptionPane.showMessageDialog(this, "처음 사진입니다.");  //메세지창 컨테이너
			}
		}else{
			if(p_center.index<p_center.imgName.length-1){ 
				System.out.println("다음");
				//MyPanel이 가진 index변수를 1증가시킨다
				p_center.index++;
			}else{ //조건이 하나일 경우 : if ~ else, 조건이 여러개일 경우 : if ~ else if
				JOptionPane.showMessageDialog(this, "마지막 사진입니다.");  //메세지창 컨테이너
			}
		}
		showImage(); //원래 있던 자리에 메서드 호출해줌
   }
   //코드의 재사용성을 위해 메서드로 빼줌
	public void showImage(){
			//공통 코드는 if ~ else 문 밖으로 꺼내줌
			//createImage()를 호출함
			p_center.createImage();  
			//한번그려진 그래픽은 조금이라도 변화가 발생한다면 
			//기존 그림을 지우고 다시 그려야 함
			//다시 그리기 위해서는 페인트 메서드를 호출해야함
			//하지만, 개발자가 paint() 메서드를 직접 호출해서는 안됨
			//그래픽 처리는, 개발자가 하는게 아니라, 시스템이 내부적으로 처리함
			//다시 그려달라고 부탁만 할 수 있음
			//repaint()  --> update() --> paint()
			//->윈도우의 크기나 위치가 변경될 때 마다 이미지를 새로 생성하므로 repaint() 메서드 호출해줌
			p_center.repaint(); 
			t_name.setText(p_center.imgName[p_center.index]);  //setter : 쓰기, getter : 읽기	
	}
	public static void main(String[] args) {
		new Gallery();  //다른 위치에서 쓸 이유가 없으므로 변수로 선언하지 않음
	}
}
