package gui; 
import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.TextArea;
import java.awt.CheckboxGroup;

//�� ���� ������Ʈ���� ������Ѻ���
class ComponentaTest {
	public static void main(String[] args) {
		//��ư ����
		Button bt=new Button("��ư1");

		//�ؽ�Ʈ�ʵ� ����
		TextField t1=new TextField(15);

		//üũ�ڽ� ����
		Checkbox ch1=new Checkbox("����", true);
		Checkbox ch2=new Checkbox("����", false);

		//����Ʈ �ڽ� ����
		Choice sel=new Choice();
		sel.add("Red");
		sel.add("Green");
		sel.add("Blue");

		//�ؽ�Ʈ ���� ����
		TextArea area=new TextArea("�ؽ�Ʈ ����", 10, 15, 30);

		//üũ�ڽ� �׷� ����
		//�ڹٿ����� HTML�� Radio�� ���� ������Ʈ�� ������ ���� Checkbox�� �׷�ȭ��Ű�� ��
		CheckboxGroup cg=new CheckboxGroup();  //�׷�ȭ�� ��Ű�� ��ü, ���(Component)�� ���� ���� 
		Checkbox g1=new Checkbox("����", cg, true);  //�׷���� ������� ������ ������ üũ�ڽ��θ� ������
		Checkbox g2=new Checkbox("����", cg, false);


		//������ ����
		Frame frame=new Frame("���� ������");
		FlowLayout flow=new FlowLayout();  //��ġ������(LayoutManager �� �ϳ�)
		
		//��ġ�����ڸ� �����ӿ� ����
		frame.setLayout(flow);

		//�����ӿ� ��ư ����
		frame.add(bt);
		frame.add(t1);
		frame.add(ch1);
		frame.add(ch2);
		frame.add(sel);
		frame.add(area);
		frame.add(g1); 
		frame.add(g2); 

		frame.setSize(500, 600);  //������ ũ��
		frame.setVisible(true); //���̰�
	}
}
