package test;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.TextArea;
import java.awt.CheckboxGroup;

//import java.awt.BorderLayout;

class ComponentaTest {
	public static void main(String[] args) {
		//������ ����
		Frame frame=new Frame("���� ������");
		FlowLayout flow=new FlowLayout();  //��ġ������

		//��ư ����
		Button bt=new Button("��ư1");		

		//�ؽ�Ʈ�ʵ� ����
		TextField t1=new TextField(15);

		//üũ�ڽ� ����
		Checkbox ch1=new Checkbox("����", true);
		Checkbox ch2=new Checkbox("����", false);

		//����Ʈ�ڽ� ����
		Choice sal=new Choice();
		sal.add("red");
		sal.add("green");
		sal.add("blue");

		//�ؽ�Ʈ ���� ����
		TextArea area=new TextArea("�ؽ�Ʈ ����", 10, 10);

		//üũ�ڽ� �׷� ����
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox g1=new Checkbox("��", cg, true);
		Checkbox g2=new Checkbox("��",cg, false);

		//��ġ�����ڸ� �����ӿ� ����
		frame.setLayout(flow);

		/*BorderLayout�� ������ ���������� ������ ���������� �߰��� ��ü�� ȭ�鿡 ����
		frame.add(bt, BorderLayout.NORTH);
		frame.add(t1, BorderLayout.CENTER);*/

		//�����ӿ� ����
		frame.add(bt);
		frame.add(t1);
		frame.add(ch1);
		frame.add(ch2);
		frame.add(sal);
		frame.add(area);
		frame.add(g1);
		frame.add(g2);

		//������ ũ�� ����, ���̰� ����
		frame.setSize(500, 600);
		frame.setVisible(true);
	}
}
