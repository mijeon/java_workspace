/*�ڹٷ� �����⸦ �������غ���*/
package gui;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.TextArea;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.Font;
import java.awt.Color;

class Editor {
	public static void main(String[] args) {
		//�޴��������� �޴��� �����ϰ� 
		//�޴��� �޴��ٿ� �����Ͽ� �����⸦ �����غ���
		//�޴��� �����ؾ� �޴��ٰ� ���� 
		Frame frame=new Frame("�޸���");
		MenuBar bar=new MenuBar();
		TextArea area=new TextArea();
        //Font font = new Font("Verdana", font.BOLD, 20);  ��Ʈũ��, 1ȸ���� �ƴҰ�� �������� ���
        area.setFont(new Font("Verdana", Font.BOLD, 20));
        area.setBackground(Color.PINK);  //����, static ������ �ö�ͼ� ���� ȣ�� ����, static�� �����ڵ忡 �ٷ� �پ ������
														 //Ŭ���� �����̱⿡ new �����ھ��� Ŭ���� ����ȣ��
        //area.setBackground(new Color(255,234,000));  //rgb�� ���� ��� ������ ���

		Menu m_file=new Menu("����");  //'����' �޴�

		//���� �޴��� �����ִ� �����۵� ����
		//�޴��������� �� ���� ���� ��, ũ�� ����
		MenuItem[] items=new MenuItem[8];  //�ڹٿ����� �ڷ����� �迭�� ���� �� ����  
		items[0]=new MenuItem("���θ����");
		items[1]=new MenuItem("��â");
		items[2]=new MenuItem("����");
		items[3]=new MenuItem("����");
		items[4]=new MenuItem("�ٸ� �̸����� ����");
		items[5]=new MenuItem("������ ����");
		items[6]=new MenuItem("�μ�");
		items[7]=new MenuItem("������");


		//�޴��ٴ� ������ �������� �ֻ�ܿ� ��ġ�ϰ� �Ǿ�����
		//��, �� ��ġ�� ����Ǿ� ����
		//�޴��� �޴��ٿ� ����
		bar.add(m_file);

		//��ҵ��� �����ӿ� ����
		//�޼��忡 �����ϱ� ���� .����
		frame.setMenuBar(bar);  //�����ӿ� �޴��� ����
		frame.add(area);  //�����ӿ� area ����

		//������ ũ��, ���̱�
		frame.setVisible(true);
		frame.setSize(800, 500); //�ٸ����� ������ ��ĥ �� �����Ƿ� �Ʒ��� �ۼ���

		//jdk5 �������� improved for���� ������, ���� �ݺ����� ����ȭ, �ӵ��� ����
		//���ϸ޴��� �����۵� �����ϱ�(�ݺ���)
		for(MenuItem obj:items){  // ������ : ����, �迭�� ������ ����ְ� ��ǻ�Ͱ� ���� ����ϵ��� ��
			m_file.add(obj);
		}
		
		/*���ϸ޴��� �����۵� �����ϱ�(�ݺ���)
		for(int i=0;i<items.length;i++){
			m_file.add(items[i]);
		}*/

		
		
	}
}
