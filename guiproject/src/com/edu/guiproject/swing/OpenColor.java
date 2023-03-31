package com.edu.guiproject.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class OpenColor extends JFrame implements ActionListener{
	JButton bt_friend, bt1, bt2, bt3, bt4, bt5, bt6, bt7;
	Panel p_cenet;
	CloseColor cc;
	
	public OpenColor(){
		bt_friend=new JButton("친구");
		bt1=new JButton();
		bt2=new JButton();
		bt3=new JButton();
		bt4=new JButton();
		bt5=new JButton();
		bt6=new JButton();
		bt7=new JButton();
		
		bt_friend.setPreferredSize(new Dimension(200, 25));
		bt1.setBackground(Color.red);
		bt2.setBackground(Color.orange);
		bt3.setBackground(Color.yellow);
		bt4.setBackground(Color.green);
		bt5.setBackground(Color.blue);
		bt6.setBackground(Color.black);
		bt7.setBackground(Color.white);


		add(bt_friend);
		add(p_center);
		add();

		//버튼에 리스너 연결
		bt_friend.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);

		setSize(200, 300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource();

		if(btn==bt_friend){
			cc=new CloseColor(this);
		}else if(btn==bt1){
			cc.p.setBackground(Color.red);	
		}else if((btn==bt2){
			cc.setBackground(Color.orange);	
		}else if((btn==bt3){
			cc.setBackground(Color.yellow);	
		}else if((btn==bt4){
			cc.setBackground(Color.green);	
		}else if((btn==bt5){
			cc.setBackground(Color.blue);	
		}else if((btn==bt6){
			cc.setBackground(Color.black);	
		else if((btn==bt7){
			cc.setBackground(Color.white);	
		}
	}
	public static void main(String[] args) {
		new OpenColor();
	}
}
