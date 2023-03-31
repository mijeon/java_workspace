package gui;
import java.awt.*;

class BorderTest extends Frame {  //extens : is a
	Button bt_north, bt_west, bt_east, bt_south, bt_center;  //has a
	BorderLayout border;  //동, 서, 남, 북, 센터의 방위를 갖는 배치관리자
	Button bt_login;  //로그인 버튼
	Button bt_regist;  //가입 버튼

	//하나의 컴포넌트에는 반드시 한 종류의 레이아웃만 적용할 수 있음
	//따라서 우리가 지금 사용중인 Frame에는 이미 BoderLayout을
	//적용한 상태이므로 다른 레이아웃을 동시에 적용할 수 없음 
	//단, 프레임안에서 레이아웃 적용이 가능한 컴포넌트를 사용하면
	//부분적으로 레이아웃을 원하는 적용이 가능함
	//이때 자주 사용되는 컴포넌트가 바로 Panel(판자)임
	Panel p;  //색상도 없고 모양도 없음 (div와 비슷)
				 //디폴트로 FlowLayout 이 적용됨

	public BorderTest(){
		//메모리에 올리기
		bt_north=new Button("NORTH");
		bt_west=new Button("WEST");
		bt_east=new Button("EAST");
		bt_south=new Button("SOUTH");
		bt_center=new Button("CENTER");
		border=new BorderLayout();
		bt_login=new Button("로그인");  
		bt_regist=new Button("회원가입");
		p=new Panel();  //판자 생성
		p.setBackground(Color.PINK);  //눈에 안보이므로, 색상을 줌


		this.setLayout(border);  //레이아웃 적용, 생략가능
		//사실 Frame은 개발자가 아무런 배치관리자를 지정하지 않으면, 디폴트로 
		//BorderLayout이 적용됨
	
		p.add(bt_login);  //판자에 로그인 버튼 부착
		p.add(bt_regist);  //판자에가입 버튼 부착

		//버튼 부착
		add(bt_north, BorderLayout.NORTH);  //(, 방위) //북쪽에 버튼 부착
		add(bt_west, BorderLayout.WEST);  //(, 방위) //서쪽에 버튼 부착
		add(p, BorderLayout.CENTER);  //(, 방위) //센터에 버튼 부착 -> 판자 부착
		add(bt_east, BorderLayout.EAST);  //(, 방위) //동쪽에 버튼 부착
		add(bt_south, BorderLayout.SOUTH);  //(, 방위) //남쪽에 버튼 부착

		setSize(500, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderTest();  //변수가지고 할일이 없어서 변수 사용 X
	}
}
