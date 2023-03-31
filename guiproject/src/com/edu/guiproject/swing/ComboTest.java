/*Swing�� jComboBox ����غ���*/
package com.edu.guiproject.swing;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ComboTest extends JFrame implements ActionListener{
	JComboBox combo;
	JButton bt_choice, bt_create;
	JTextArea area;
	JScrollPane scroll;  //�ڹ��� ��ũ�ѹ�
	FruitList fList;

	public ComboTest(){
		combo=new JComboBox();
		bt_choice=new JButton("����");
		bt_create=new JButton("��â");
		area=new JTextArea(15, 20);
		scroll=new JScrollPane(area);  //area�� ��ũ�� ���� //scroll�� area�� ��Ƹ���

		//�÷ο� ���̾ƿ� ����
		setLayout(new java.awt.FlowLayout());  //java.awt�� �ִٴ°� �����ϱ� ���� ���� ��������
		
		//�޺��ڽ��� ������ �߰��ϱ�
		combo.addItem("�ٳ���");  //String ��ü�� �ᱹ �ֻ��� ��ü�� Object�� ��ӹ���.  = is a���谡 ����
		combo.addItem("����");   //String -> Object  ����ȭ�� �����ȿ� �ִ� �ν��Ͻ��� �̱� ������ ��, �ٿ� ĳ���� ����
		combo.addItem("����");
		combo.addItem("����");

		//������ ����
		combo.setPreferredSize(new Dimension(250, 25));

		//����(���������θ� ������踦 ���� ����)
		add(combo);
		add(bt_choice);
		add(bt_create);
		add(scroll);  //scroll�� area�� ���ΰ� �����Ƿ� scroll�� ����

		setSize(300, 400);
		setVisible(true);

	//��ư�� ������ ����
	bt_choice.addActionListener(this);
	bt_create.addActionListener(this);
	}

	//Ŭ���̺�Ʈ�޼ҵ� ����
	public void actionPerformed(ActionEvent e){
		//ActionEvent���� ��� �̺�Ʈ������ ����ִ�(����, ����, ������)
		Object obj=e.getSource();  //�̺�Ʈ�� ����Ų ��Ҹ� ������ �̺�Ʈ�ҽ��� ��

		//ActionEvent�� ��ư�Ӹ� �ƴ϶� ���� ��� �̺�Ʈ�� ������ �� ����
		//���� getSource()�� ��ȯ�Ǵ� �̺�Ʈ�� ����Ų ��Ҹ� ������ �� ���� ������
		//sun���� �ƿ�
		JButton btn=(JButton)obj;  //��ĳ����
		if(btn==bt_choice){  //������ư
				//System.out.println("�����߰�����");

				//�޺��ڽ��� html select���� ������ Ʋ�� ��ư, �̹���� ���� �� �ִ� ������ ���û�����
				//���� ���� �� Object������ �� ������ ���� ���� Object������ ��ȯ�ǹǷ�, �����ڰ�
				//������ �ڷ������� ����Ȳ�Ͽ� ����ϸ� ��
				String item=(String)combo.getSelectedItem();  //�ٿ�ĳ����
				area.append(item+"\n");
			if(fList != null){
				fList.area.append(item+"\n");
			}
		}else if(btn==bt_create){ //������ư
		fList=new FruitList();
		//�޼��� ȣ��
		//�������ڸ���, fList���� ��ٸ��� �ִ� 
		//setCombo() �޼��带 ȣ���Ͽ� ���� �ּҰ��� �Ѱ����� -> call by reference
		fList.setCombo(this);  //2) ���⼭ this�� �ؿ� ���߿� �� �ν��Ͻ��� �Ű������� ������ ��.
		}  
	}

	public static void main(String[] args) {
		new ComboTest();  //1) ������ ���� �ν��Ͻ�. ����(Heap)�� ���ִ� ����
	}
}
