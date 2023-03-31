/*JPnel�� �׷���ó����, �����ڰ� �ֵ��Ͽ� �׸��� ����
paint() �޼��带 ����������, �� ����׸���*/
package com.edu.guiproject.graphic; 
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Image;

class MyPanel extends JPanel{
	//�ڹ�gui���� �̹����� Toolkit Ŭ�����κ��� �ν��Ͻ��� ���� �� ����
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image img;
	Gallery gallery;  //null
	String[] imgName={"abc.jfif","amgy.jfif","api.jfif","bbnj.jfif","ccv.jfif","eert.jfif","kko.jfif","mop.jfif", "ney.jfif", "rrt.jfif"};
	int index=0;  //���° �̹������� ��������� �����ϴ� ����

	public MyPanel(Gallery gallery){  //������ �ν��Ͻ��� �����ڷ� �Ѱܹ���
		this.gallery=gallery;  //this ���� ���� ? �ּҰ��� �Ҵ�޴� this�� MyPanel�� �ɹ��������� �˷��ֱ� ���ؼ� ���
		//img=kit.getImage("C:/java_workspace/guiproject/res/sea/"+imgName[index]); //���뼺
		createImage();  //�޼��� ȣ��
	}
	//�����̳�, ���� ��ư ���� ������ �̹����� ���;� �ϹǷ�
	//�ᱹ �̹����� ��� �۾��� ���뼺�� ����, ���� �޼���� ������
	public void createImage(){
		img=kit.getImage("C:/java_workspace/guiproject/res/sea/"+imgName[index]); 
	}
	/*
	paint() �޼���� �����ڰ� ȣ���ϴ� �޼��尡 �ƴ϶�, �������ؾ��� (�������̵�)
	�ý��ۿ� ���� �׷��� ������Ʈ�� ȭ�鿡 �׷������� �� ���������� �˾Ƽ� �帧
	update() : ���� ȭ�� �����
	paint() : �׸��� �׸�
	*/
	public void paint(Graphics g){  //new MyPanel(�ν��Ͻ�); //abstract : �߻�Ŭ����
		System.out.println("�� �׸��� �־��");
		//drawImage(Image img, int x, int y, int width, int height, ImageObserver observer : �̹����� ���������)
		//�̹����� �����ڸ� ���� �ٱ��� �����̳ʷ� ����
		g.drawImage(img, 0, 0, 490, 490, gallery);  //Gallery�ν��Ͻ�
																		//��üŸ�� �� -> ����, �� -> ���
	}
}
