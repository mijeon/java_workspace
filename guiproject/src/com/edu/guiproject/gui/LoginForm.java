package gui;
import java.awt.*;

class LoginForm extends Frame {
	//������� ����, �ʱ�ȭ�� �̽ǽ�
	Label la_title;
	Panel p_north;
	Panel p_center;
	Panel p_south;
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_regist;

	//�����ڸ޼��带 ����
	public LoginForm(){ 
		la_title=new Label("Login");
		p_north=new Panel();
		p_center=new Panel();
		p_south=new Panel();
		la_id=new Label("ID");
		la_pass=new Label("PASS");
		t_id=new TextField();
		t_pass=new TextField();
		bt_login=new Button("�α���");
		bt_regist=new Button("����");

		//��Ÿ�� ����
		p_center.setBackground(Color.PINK);  //�����гο� ����


		//����
		//���̵�, �佺���� �� �Է������� p_center �гο� ����
		p_north.add(la_title);
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);

		//�÷ο� ���̾ƿ�����, ������ �����ϸ� ������ �з����� ������ �̿���
		//������Ʈ���� �����غ���
		Dimension d=new Dimension(130, 25);
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);

		add(p_north, BorderLayout.NORTH);
		add(p_center, BorderLayout.CENTER);  //���� ������ p_center ����
		p_south.add(bt_login);  //�����гο� ��ư ����
		p_south.add(bt_regist);  //�����гο� ��ư ����
		add(p_south, BorderLayout.SOUTH);  //p_south�� �������� ���ʿ� ����
		
		//������ �����ֱ�
		setSize(320, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginForm();  //����� �����ڸ޼��带 ȣ�� �� ����
	}
}