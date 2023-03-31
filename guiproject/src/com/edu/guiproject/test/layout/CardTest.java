package test.layout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

class CardTest extends Frame {
	//맴버변수 정의
	Panel p_north, p_center;
	Button bt_board, bt_member, bt_login, bt_cs;
	Panel p_board, p_member, p_login, p_cs;
	CardLayout card;
	
	//생성자메서드 정의, 초기화
	public CardTest(){
		p_north=new Panel();
		p_center=new Panel();
		bt_board=new Button("게시판");
		bt_member=new Button("회원정보");
		bt_login=new Button("로그인");
		bt_cs=new Button("고객센터");

		p_board=new Panel();
		p_member=new Panel();
		p_login=new Panel();
		p_cs=new Panel();

		//CardLayout 적용
		//setLayout(card=new CardLayout());
		p_center.setLayout(card = new CardLayout());

		//패널에 디자인 적용
		p_board.setBackground(Color.lightGray);
		p_member.setBackground(Color.pink);
		p_login.setBackground(Color.cyan);
		p_cs.setBackground(Color.	blue);

		//패널에 버튼 부착
		p_north.add(bt_board);
		p_north.add(bt_member);
		p_north.add(bt_login);
		p_north.add(bt_cs);

		//버튼을 부착한 패널을 북쪽에 붙임
		add(p_north, BorderLayout.NORTH);
		add(p_center);

		//CardLayout에 카드들을 붙이자
		p_center.add(p_board);  //CENTER는 디폴트이므로 생략가능
		p_center.add(p_member);
		p_center.add(p_login);
		p_center.add(p_cs);

		//부착된 패널(카드) 중 다음 카드 보여주기
		card.next(p_center);
		card.next(p_center);
		
		
		//프레임의 크기, 보이게 설정
		setSize(500, 450);
		setVisible(true);
	}
	public static void main(String[] args) {
		//선언된 생성자메서드를 호출 및 실행
		new CardTest();
	}
}
