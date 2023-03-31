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
	JPanel p_center;  //��ư���� �÷��� �г�
	MyButton[] btn;
	Color[] color={Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.pink, Color.white};
	ColorResult cr;  //�������� �ݿ��� ģ�� ������

	public ColorChooser(){
		bt_north=new JButton("��â ����");
		p_center=new JPanel();
		btn=new MyButton[7]; //��ư�� ������ ������ ����

		//����
		add(bt_north, BorderLayout.NORTH);
		add(p_center);
		for(int i=0;i<btn.length;i++){
			btn[i]=new MyButton(color[i]);
			p_center.add(btn[i]);  //�г��̹Ƿ� FlowLayout�� ����

			//���� ��ư�� �����ʿ��� ����
			btn[i].addActionListener(this);
		}

		setSize(450, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//���ʹ�ư�� ������ ����
		bt_north.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource();
		if(obj==bt_north){  //ģ����ư ����
			cr=new ColorResult();
		}else{
			for(int i=0;i<btn.length;i++){
				//���� obj�� ����� �̺�Ʈ�ҽ���, ��ư�迭�� i��°�� ���ٸ�
				if(obj==btn[i]){
					System.out.println(color[i]+"���� �����߾�?");
					//�߰ߵ� ������ ģ���� �г��� �������� ��������
					cr.p.setBackground(color[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		new ColorChooser();
	}
}
