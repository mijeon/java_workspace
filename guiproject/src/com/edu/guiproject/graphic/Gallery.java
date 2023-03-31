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
		bt_prev=new JButton("����");
		bt_next=new JButton("����");
		t_name=new JTextField(25);
		
		//�гο� ��ư ����
		p_north.add(bt_prev);
		p_north.add(t_name);
		p_north.add(bt_next);

		//�г��� ���ʿ� ����
		add(p_north, BorderLayout.NORTH);
		//�г��� ���Ϳ� ����
		add(p_center);
	

		setSize(500, 550);
		setVisible(true);

		//��ư�� ������ ����
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
		showImage();  //ó���� ���ϸ� ǥ�ø� ���� �����ڿ� �־ �ʱ�ȭ ������
   }
   
   public void actionPerformed(ActionEvent e)   {
		Object obj = e.getSource();  //�̹� �ִ� �޼ҵ� ��� �� �޼ҵ� �ȿ� � ����� ��������� �𸣹Ƿ� �ֻ��� ��ü�� �������
												 

		if(obj == bt_prev) {
			if(p_center.index>0){
				System.out.println("����");
				p_center.index--;
			}else{
				JOptionPane.showMessageDialog(this, "ó�� �����Դϴ�.");  //�޼���â �����̳�
			}
		}else{
			if(p_center.index<p_center.imgName.length-1){ 
				System.out.println("����");
				//MyPanel�� ���� index������ 1������Ų��
				p_center.index++;
			}else{ //������ �ϳ��� ��� : if ~ else, ������ �������� ��� : if ~ else if
				JOptionPane.showMessageDialog(this, "������ �����Դϴ�.");  //�޼���â �����̳�
			}
		}
		showImage(); //���� �ִ� �ڸ��� �޼��� ȣ������
   }
   //�ڵ��� ���뼺�� ���� �޼���� ����
	public void showImage(){
			//���� �ڵ�� if ~ else �� ������ ������
			//createImage()�� ȣ����
			p_center.createImage();  
			//�ѹ��׷��� �׷����� �����̶� ��ȭ�� �߻��Ѵٸ� 
			//���� �׸��� ����� �ٽ� �׷��� ��
			//�ٽ� �׸��� ���ؼ��� ����Ʈ �޼��带 ȣ���ؾ���
			//������, �����ڰ� paint() �޼��带 ���� ȣ���ؼ��� �ȵ�
			//�׷��� ó����, �����ڰ� �ϴ°� �ƴ϶�, �ý����� ���������� ó����
			//�ٽ� �׷��޶�� ��Ź�� �� �� ����
			//repaint()  --> update() --> paint()
			//->�������� ũ�⳪ ��ġ�� ����� �� ���� �̹����� ���� �����ϹǷ� repaint() �޼��� ȣ������
			p_center.repaint(); 
			t_name.setText(p_center.imgName[p_center.index]);  //setter : ����, getter : �б�	
	}
	public static void main(String[] args) {
		new Gallery();  //�ٸ� ��ġ���� �� ������ �����Ƿ� ������ �������� ����
	}
}
