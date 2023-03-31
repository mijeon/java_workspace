package com.edu.guiproject.test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

class Gallery extends JFrame implements ActionListener {
	//정의
	JPanel p_north;
	MyPanel p_center;
	JButton bt_prev, bt_next;
	JTextField t_name;

	//생성
	public Gallery(){
		p_north=new JPanel();
		p_center=new MyPanel(this);  //this?
		bt_prev=new JButton("이전");
		bt_next=new JButton("다음");
		t_name=new JTextField(25);
		t_name.setText(p_center.imgName[p_center.index]);

		//패널에 부착
		p_north.add(bt_prev);
		p_north.add(t_name);
		p_north.add(bt_next);

		//패널을 북쪽에 부착
		add(p_north, BorderLayout.NORTH);

		//패널을 센터에 부착
		add(p_center);

		//윈도우 크기, 보이게 설정
		setSize(500, 550);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//버튼에 리스너 연결
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource();

		if(obj==bt_next){
			System.out.println("다음");
			if(p_center.index<p_center.imgName.length-1){
				p_center.index++;
			}else{
				JOptionPane.showMessageDialog(this, "마지막 사진입니다.");  //this?
			}

		}else{
			System.out.println("이전");
			if(p_center.index>0){
				p_center.index--;
			}else{
				JOptionPane.showMessageDialog(this, "처음 사진입니다.");  
			}
		}
			p_center.createImage();
			p_center.repaint();
			t_name.setText(p_center.imgName[p_center.index]);
	}

	public static void main(String[] args) {
		new Gallery();
	}
}
