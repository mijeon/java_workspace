package com.edu.guiproject.graphic;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ColorChooser extends JFrame implements ActionListener{
	JButton bt_north;
	JPanel p_center;  //버튼들이 올려질 패널
	MyButton[] btn;
	Color[] color={Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.pink, Color.white};
	ColorResult cr;  //색상결과를 반영할 친구 프레임

	public ColorChooser(){
		bt_north=new JButton("새창 띄우기");
		p_center=new JPanel();
		btn=new MyButton[7]; //버튼이 생성될 공간만 만듬

		//조립
		add(bt_north, BorderLayout.NORTH);
		add(p_center);
		for(int i=0;i<btn.length;i++){
			btn[i]=new MyButton(color[i]);
			p_center.add(btn[i]);  //패널이므로 FlowLayout에 부착

			//나의 버튼과 리스너와의 연결
			btn[i].addActionListener(this);
		}

		setSize(450, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//북쪽버튼과 리스너 연결
		bt_north.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource();
		if(obj==bt_north){  //친구버튼 생성
			cr=new ColorResult();
		}else{
			for(int i=0;i<btn.length;i++){
				//현재 obj에 담겨진 이벤트소스와, 버튼배열의 i번째가 같다면
				if(obj==btn[i]){
					System.out.println(color[i]+"색상 선택했어?");
					//발견된 색상을 친구의 패널의 배경색으로 적용하자
					cr.p.setBackground(color[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		new ColorChooser();
	}
}
