package test;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;

class FrameTest {
	public static void main(String[] args) {
		//프레임 생성
		Frame f=new Frame();

		//버튼 생성
		Button bt=new Button("버튼");

		//프레임 지정
		f.setVisible(true);  //보이게
		f.setSize(300, 400);  //너비, 높이

		//컴포넌트들을 붙이기 전에, 배치방법 결정-> 레이아웃
		FlowLayout flow=new FlowLayout();

		//윈도우에 레이아웃 적용 -> 레이아웃 적용 시 버튼이 작아짐
		f.setLayout(flow);

		//생성된 요소를 프레임에 부착
		f.add(bt);
	}
}
