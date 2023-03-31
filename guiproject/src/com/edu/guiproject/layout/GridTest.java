/*
FlowLayout : �ٱ��� �����̳��� ũ�⿡ ����, ���빰�� �귯�ٴϴ� ���̾ƿ�
BorderLayout : ��, ��, ��, ��, ���� �� 5���� ������ ���� ���̾ƿ�
GridLayout : ��� ���� �̷���� ���̾ƿ�(����)
CardLayout : ȭ����ȯ �� ���Ǵ� ���̾ƿ�
GridbagLayout : GridLayout�� ���� ���� �����ϴ� ���̾ƿ�
*/
package com.edu.guiproject.layout;
//�׸��� ���̾ƿ� ����غ���
import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;

class GridTest extends Frame {
	Button[] btn=new Button[15];  //�ڹٿ����� �迭ũ�� ���
	GridLayout grid;
	
	
	//�����ڸ޼��� ����, �ʱ�ȭ
	public GridTest(){
		//int x=1; �θ��� �ʱ�ȭ���� �ռ��� �ڽ��� �ڵ�� ���� �� ����

		//���� �ʱ�ȭ�Ǳ� ����, �θ� ���� �ʱ�ȭ�Ǿ�� ��
		//�θ��� �μ��ִ� �����ڸ� ȣ���ϱ⸦ ���ϸ�, super�� ȣ��
		super("�׸��� �׽�Ʈ");  //�������� new �����ڷ� ������ ��� â�� �ϳ� �� ����� ������ �θ� �������� �������
		
		//��ư�� �����Ǳ� ���� �׸��尡 ����Ǿ���ϹǷ� ��ġ�� ��ư���� ����-> 
		grid=new GridLayout(5, 3);  //2�� 4ȣ��
		setLayout(grid);  //�����ӿ� �׸��巹�̾ƿ� ����
		//�� �������� ���̾ƿ��� BorderLayout --> GridLayout

		for (int i=0;i<btn.length;i++){
			//�׵��� �츮�� ����ؿԴ� ���ڿ��� ������ ��ȯ�ϴ°��� �ͼ������� "1" --> parseInt() : ���ڸ� ���ڷ�
			//������ �������� ���ڿ���ü�� ��ȯ�ϴ°��� �ڹ��� Ư�� ��ü���� ������, �� ��ü���� ������ WrapperŬ������ ��
			btn[i]=new Button(Integer.toString(i));  //��ư �ȿ� ���ڸ� �־��ֱ� ���� ���� ->���ڷ� ��ȯ��
			add(btn[i]);  //�����ӿ� ����
		}

		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		//����� �����ڸ޼��带 ȣ�� �� ����
		new GridTest(); 
	}
}
