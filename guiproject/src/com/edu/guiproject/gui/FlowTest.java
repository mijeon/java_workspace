/*������Ʈ���� �����ӿ� �÷����� ����, �����ڴ� ��ġ�� ����� ���� ����ؾ� ��
���� �����ڰ� ��ġ�� ������ ������, Frame���� ����Ʈ�� BordelLayout�� �����
(���� '���'�� ������)
1) FlowLayout : ������Ʈ�� �����̳��� ũ�⿡ ���� �������� �ʰ�, �귯�ٴ� �� �ִ� ��ġ, 
						�� ������Ʈ���� �ڽ��� ũ�⸦ ����� �������� �� ����
2) BorderLayout : ��, ��, ��, ��, ���Ͷ�� ������ ���� ��ġ
3) GridLayout : ǥ, ���ڱ����� ��ġ
4) GridBagLayout : GridLayout�� �� ���������� ����
5) CardLayout : ī����ȯ�� ȿ��ó�� ��ġ
*/
package gui;
import java.awt.*;

class FlowTest extends Frame {  //�ڱ� �ڽſ��� ����, FlowTest�� �� ������
	Button bt;  //FlowTest has a Button : �ɹ����� ���� has a(O)
	int a;  //has a, is a�� �� ����� �繰�� ���� has a(X)
	FlowLayout flow;  //has a
	Label la;  //�ܼ��� �ؽ�Ʈ�� ǥ���ϴ� ������Ʈ

	//has a ����� ��ü�� ������ ���, �������� ������ ���� �� �ʿ���
	public FlowTest(){
		bt=new Button("��ư");
		flow=new FlowLayout();
		la=new Label("�α���");

		//�繰�� �÷����� ���� ��ġ�� ���� ��������
		setLayout(flow); //���� '��'�� frame�� FlowLayout ����

		add(bt);  //this ��������, this.add(bt)
		add(la);

		setSize(300, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//Frame f=new Frame(); //class FlowTest extends Frame �� ��� �Ƚ��൵ ��
		new FlowTest();  //�������� ���� ����, ��=������
	}
}
