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
	//����
	JPanel p_north;
	MyPanel p_center;
	JButton bt_prev, bt_next;
	JTextField t_name;

	//����
	public Gallery(){
		p_north=new JPanel();
		p_center=new MyPanel(this);  //this?
		bt_prev=new JButton("����");
		bt_next=new JButton("����");
		t_name=new JTextField(25);
		t_name.setText(p_center.imgName[p_center.index]);

		//�гο� ����
		p_north.add(bt_prev);
		p_north.add(t_name);
		p_north.add(bt_next);

		//�г��� ���ʿ� ����
		add(p_north, BorderLayout.NORTH);

		//�г��� ���Ϳ� ����
		add(p_center);

		//������ ũ��, ���̰� ����
		setSize(500, 550);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//��ư�� ������ ����
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource();

		if(obj==bt_next){
			System.out.println("����");
			if(p_center.index<p_center.imgName.length-1){
				p_center.index++;
			}else{
				JOptionPane.showMessageDialog(this, "������ �����Դϴ�.");  //this?
			}

		}else{
			System.out.println("����");
			if(p_center.index>0){
				p_center.index--;
			}else{
				JOptionPane.showMessageDialog(this, "ó�� �����Դϴ�.");  
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
