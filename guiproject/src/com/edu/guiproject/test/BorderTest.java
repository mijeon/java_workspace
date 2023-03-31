package test;
import java.awt.*;

class BorderTest extends Frame {
		//맴버변수 선언
		BorderLayout border;
		Button bt_east, bt_west, bt_south, bt_north, bt_center;
		Button bt_login, bt_regist;
		Panel p;

		//생성자메서드를 정의하고 초기화
	public BorderTest(){
		//메모리에 올리기
		border=new BorderLayout();
		bt_east=new Button("EAST");
		bt_west=new Button("WEST");
		bt_south=new Button("SOUTH");
		bt_north=new Button("NORTH");
		bt_center=new Button("CENTER");
		bt_login=new Button("로그인");
		bt_regist=new Button("회원가입");
		p=new Panel();
		p.setBackground(Color.pink);

		this.setLayout(border);

		//버튼 부착
		add(bt_east, BorderLayout.EAST);
		add(bt_west, BorderLayout.WEST);
		add(bt_south, BorderLayout.SOUTH);
		add(bt_north, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);

		//판넬에 버튼 부착
		p.add(bt_login);
		p.add(bt_regist);

		//프레임 크기, 보이게 설정
		setTitle("border");
		setSize(500, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//선언된 생성자메서드를 호출 및 실행
		new BorderTest();
	}
}
