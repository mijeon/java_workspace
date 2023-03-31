package test;
import java.awt.*;

class LoginForm extends Frame{
	//맴버변수 선언
	Panel p_center;
	Panel p_south;
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_regist;

	//생성자메서드 정의
	public LoginForm(){
		p_center=new Panel();
		p_south=new Panel();
		la_id=new Label("ID");
		la_pass=new Label("PASS");
		t_id=new TextField();
		t_pass=new TextField();
		bt_login=new Button("로그인");
		bt_regist=new Button("가입");

		//스타일적용
		p_center.setBackground(Color.pink);
		p_south.setBackground(Color.gray);
		
		
		//패널에 부착
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);

		//플로우 레이아웃에서, 공간이 부족하면 및으로 밀려나는 현상을 이용해 
		//컴포넌트들을 정렬해보자
		Dimension d=new Dimension(100, 20);
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);

		//버튼 부착
		add(p_center, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);
		p_south.add(bt_login);
		p_south.add(bt_regist);

		//윈도우 보여주기
		setTitle("Login");
		setVisible(true);
		setSize(300, 150);
	}
	public static void main(String[] args) {
		//선언된 생성자메서드를 호출 및 실행
		new LoginForm();
	}
}
