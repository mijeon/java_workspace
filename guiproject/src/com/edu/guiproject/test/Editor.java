package test;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.TextArea;
import java.awt.MenuItem;
import java.awt.Font;
import java.awt.Color;

class Editor {
	public static void main(String[] args) {
		//�޴��������� �޴��� �����ϰ�
		//�޴��� �޴��ٿ� �����Ͽ� �����⸦ �����غ���
		Frame frame=new Frame("�޸���");
		MenuBar bar=new MenuBar();
		Menu m_file=new Menu("����");
		TextArea area=new TextArea();
		area.setFont(new Font("Verdana", Font.BOLD, 20));
		area.setBackground(Color.PINK);

		//���ϸ޴��� �����۵� ����
		//�޴��������� �� ���� ���� ��, ũ������
		MenuItem[] items=new MenuItem[8];
		items[0]=new MenuItem("���� �����");
		items[1]=new MenuItem("��â");
		items[2]=new MenuItem("����");
		items[3]=new MenuItem("����");
		items[5]=new MenuItem("�ٸ� �̸����� ����");
		items[6]=new MenuItem("������ ����");
		items[7]=new MenuItem("�μ�");
		items[4]=new MenuItem("������");

		//���� �޴��� �����۵� �����ϱ�
		for(MenuItem obj:items){  
			m_file.add(obj);
		}

		//�޴��� �޴��ٿ� ����
		bar.add(m_file);

		//��ҵ��� �����ӿ� ����
		frame.setMenuBar(bar);
		frame.add(area);

		//������ ũ��, ���̰� ����
		frame.setVisible(true);
		frame.setSize(800, 500);


	}
}
