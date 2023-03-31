package gui;
import java.awt.*;

class LoginForm extends Frame {
	//멤버변수 선언, 초기화는 미실시
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

	//생성자메서드를 정의
	public LoginForm(){ 
		la_title=new Label("Login");
		p_north=new Panel();
		p_center=new Panel();
		p_south=new Panel();
		la_id=new Label("ID");
		la_pass=new Label("PASS");
		t_id=new TextField();
		t_pass=new TextField();
		bt_login=new Button("로그인");
		bt_regist=new Button("가입");

		//스타일 적용
		p_center.setBackground(Color.PINK);  //센터패널에 배경색


		//조립
		//아이디, 페스워드 등 입력폼들을 p_center 패널에 부착
		p_north.add(la_title);
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);

		//플로우 레이아웃에서, 공간이 부족하면 밑으로 밀려나는 현상을 이용해
		//컴포넌트들을 정렬해보자
		Dimension d=new Dimension(130, 25);
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_pass.setPreferredSize(d);
		t_pass.setPreferredSize(d);

		add(p_north, BorderLayout.NORTH);
		add(p_center, BorderLayout.CENTER);  //센터 영역에 p_center 부착
		p_south.add(bt_login);  //남쪽패널에 버튼 부착
		p_south.add(bt_regist);  //남쪽패널에 버튼 부착
		add(p_south, BorderLayout.SOUTH);  //p_south를 프레임의 남쪽에 부착
		
		//윈도우 보여주기
		setSize(320, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginForm();  //선언된 생성자메서드를 호출 및 실행
	}
}
