package test;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;

class FrameTest {
	public static void main(String[] args) {
		//������ ����
		Frame f=new Frame();

		//��ư ����
		Button bt=new Button("��ư");

		//������ ����
		f.setVisible(true);  //���̰�
		f.setSize(300, 400);  //�ʺ�, ����

		//������Ʈ���� ���̱� ����, ��ġ��� ����-> ���̾ƿ�
		FlowLayout flow=new FlowLayout();

		//�����쿡 ���̾ƿ� ���� -> ���̾ƿ� ���� �� ��ư�� �۾���
		f.setLayout(flow);

		//������ ��Ҹ� �����ӿ� ����
		f.add(bt);
	}
}
