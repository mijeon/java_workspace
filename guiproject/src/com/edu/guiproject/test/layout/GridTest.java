package test.layout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;

class GridTest extends Frame {
	//�ɹ����� ����
	Button[] bt=new Button[15];  //�迭ũ�� ���
	GridLayout grid;
	
	public GridTest(){
		super("�׸��� �׽�Ʈ");

		grid=new GridLayout(5, 3); //��, ��


		//�����ӿ� �׸��巹�̾ƿ� ����
		setLayout(grid);

		for (int i=0; i<bt.length; i++){
			bt[i]=new Button(Integer.toString(i)); 
			add(bt[i]);  //�����ӿ� ����
		}

		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		//����� �����ڸ޼��带 ȣ�� �� ����
		new GridTest();
	}
}
