/*컴포넌트들을 프레임에 올려놓기 전에, 개발자는 배치의 방법을 먼저 고민해야 함
만일 개발자가 배치를 정하지 않으면, Frame에는 디폴트로 BordelLayout이 적용됨
(따라서 '대왕'이 생성됨)
1) FlowLayout : 컴포넌트가 컨테이너의 크기에 맞춰 고정되지 않고, 흘러다닐 수 있는 배치, 
						각 컴포넌트들은 자신의 크기를 제대로 갖고있을 수 있음
2) BorderLayout : 동, 서, 남, 북, 센터라는 방위를 갖는 배치
3) GridLayout : 표, 격자구조로 배치
4) GridBagLayout : GridLayout을 더 세부적으로 조정
5) CardLayout : 카드전환의 효과처럼 배치
*/
package gui;
import java.awt.*;

class FlowTest extends Frame {  //자기 자신에게 부착, FlowTest가 곧 프레임
	Button bt;  //FlowTest has a Button : 맴버변수 영역 has a(O)
	int a;  //has a, is a의 그 대상이 사물만 가능 has a(X)
	FlowLayout flow;  //has a
	Label la;  //단순히 텍스트를 표현하는 컴포넌트

	//has a 관계로 객체를 보유할 경우, 생성자의 쓰임은 더욱 더 필요함
	public FlowTest(){
		bt=new Button("버튼");
		flow=new FlowLayout();
		la=new Label("로그인");

		//사물을 올려놓기 전에 배치를 먼저 결정하자
		setLayout(flow); //현재 '나'인 frame에 FlowLayout 적용

		add(bt);  //this 생략가능, this.add(bt)
		add(la);

		setSize(300, 400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//Frame f=new Frame(); //class FlowTest extends Frame 쓸 경우 안써줘도 됨
		new FlowTest();  //프레임인 나를 선언, 나=윈도우
	}
}
