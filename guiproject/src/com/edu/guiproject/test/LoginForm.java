package test;
import java.awt.*;

class LoginForm extends Frame{
	//�ɹ����� ����
	Panel p_center;
	Panel p_south;
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_regist;

	//�����ڸ޼��� ����
	public LoginForm(){
		p_center=new Panel();
		p_south=new Panel();
		la_id=new Label("ID");
		la_pass=new Label("PASS");
		t_id=new TextField();
		t_pass=new TextField();
		bt_login=new Button("�α���");
		bt_regist=new Button("����");

		//��Ÿ������
		p_center.setBackground(Color.pink);
		p_south.setBackground(Color.gray);
		
		
		//�гο� ����
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);

		//�÷ο� ���̾ƿ�����, ������ �����ϸ� ������ �з����� ������ �̿��� 
		//������Ʈ���� �����غ���
		Dimension d=new Dimension(100, 20);
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);

		//��ư ����
		add(p_center, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);
		p_south.add(bt_login);
		p_south.add(bt_regist);

		//������ �����ֱ�
		setTitle("Login");
		setVisible(true);
		setSize(300, 150);
	}
	public static void main(String[] args) {
		//����� �����ڸ޼��带 ȣ�� �� ����
		new LoginForm();
	}
}
