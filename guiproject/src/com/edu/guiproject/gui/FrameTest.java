/*�ڹٵ� �Ϲ����� �������α׷��� ���(C, C#, C++...) ó�� GUI ������Ʈ�� �����ϰ�, 
���� ��Ű���� java.awt, javax.swing���� ������*/
package gui;
import java.awt.Frame;   //���� �ٸ� ��Ű���� �ִ°� �������� ����
import java.awt.Button;
import java.awt.FlowLayout;

class FrameTest {
	public static void main(String[] args) {
		/*���� ó������ Ŭ������ ���� ��ó��
			1) ��� ��ü�� �ֿ� ������ �������� �ľ�
			2) �ᱹ ����� �ذ��̱⿡ �޸𸮿� �ø��� ���� ����
			- �Ϲ� : ������ Ŭ�����̹Ƿ� new �������� ����� ��
			- �߻� : �ҿ����ϹǷ�, �ڽ��� ���� �ϼ��� �� �ڽ��� new
			-�������̽� : �ҿ����ϹǷ� �ڽ��� ���� �ϼ��� �� �ڽ��� new
			����) �߻�, �������̽��� ���������� �̹� ����������� �ش�
			�ν��Ͻ��� �̹� �����Ͽ�, �޼��� ȣ�⸸���ε� �ν��Ͻ���
			������ �� �ֵ��� �������� */

		//java������ �����츦 ���� ����ϴ� ���� �ƴ϶�, �������� �ڽ��� frame ��ü�� �����
		Frame f=null;  //���������� �����ڰ� �ʱ�ȭ���� ������ null�� �ʱ�ȭ���� ����
		f=new Frame();  //������ â ������ (�ʱ⿣ �Ⱥ���)
		System.out.println("������ �ּҰ��� "+f);
		
		//������ ũ�� ����, ���̰� ����
		f.setVisible(true);
		f.setSize(300, 400);  //�ʺ�, ����

		
		//������Ʈ���� ���̱� ����, ��ġ����� ��������-> ���̾ƿ�
		//FlowLayout flow;
		FlowLayout flow=new FlowLayout();

		//�����쿡 ���̾ƿ� ����
		f.setLayout(flow);

		//��ư ����
		//Button bt;
		Button bt=new Button("�� ��ư");

		//������ ��ư(���)�� �����쿡 ����
		f.add(bt);  //�����̳�.����(); Button is a Component
		
		/*��չ�ư ������ ����
			-��� GUI ���α׷��� ������Ʈ ������ �ռ�, 
			��ġ(Layout)�� �����ؾ� ��
			�ڹ� awt������ ��ġ�� �����ϴ� ��ü�� ���� ������ 
			1) FlowLayout (o)  : ���� ���
			2) BorderLayout (o)
			3) GridLayout (o)
			4) GridBagLayout
			4) CardLayout
		*/
	}
}