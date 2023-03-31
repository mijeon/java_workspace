package gui;
import java.awt.*;

class LoginTest extends Frame {
	Button bt_north, bt_center, bt_south;
	Button bt_login;
	Button bt_regist;
	Panel p_sou;
	Panel p_cen;
	Label la_id;
	Label la_pass;
	
	public LoginTest(){
		//메모리에 올리기
		bt_north=new Button("LOGIN");
		bt_center=new Button("CENTER");
		bt_south=new Button("SOUTH");
		bt_login=new Button("로그인");
		bt_regist=new Button("회원가입");
		p_sou=new Panel();
		p_sou.setBackground(Color.PINK);
		p_cen=new Panel();
		p_cen.setBackground(Color.white);
		la_id=new Label("ID");
		la_pass=new Label("ID");
		la_id.setPreferredSize(new Dimension (200,150));
		la_pass.setPreferredSize(new Dimension (200,150));
		la_pass=new Label("PASS");
		TextField area1=new TextField(20);
		TextField area2=new TextField(20);

		p_sou.add(bt_login);
		p_sou.add(bt_regist);

		p_cen.add(la_id);
		p_cen.add(area1);
		p_cen.add(la_pass);
		p_cen.add(area2);

		//부착
		add(bt_north, BorderLayout.NORTH);
		add(p_cen, BorderLayout.CENTER);
		add(p_sou, BorderLayout.SOUTH);

		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LoginTest();
	}
}
