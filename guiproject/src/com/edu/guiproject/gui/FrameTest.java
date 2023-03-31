/*자바도 일반적인 응용프로그래밍 언어(C, C#, C++...) 처럼 GUI 컴포넌트를 지원하고, 
관련 패키지는 java.awt, javax.swing에서 지원함*/
package gui;
import java.awt.Frame;   //나와 다른 패키지에 있는걸 가져오기 위해
import java.awt.Button;
import java.awt.FlowLayout;

class FrameTest {
	public static void main(String[] args) {
		/*난생 처음보는 클래스에 대한 대처법
			1) 대상 객체가 주요 목적이 무엇인지 파악
			2) 결국 쓰라고 준것이기에 메모리에 올리는 법을 조사
			- 일반 : 완전한 클래스이므로 new 연산자의 대상이 됨
			- 추상 : 불완전하므로, 자식을 통해 완성한 후 자식을 new
			-인터페이스 : 불완전하므로 자식을 통해 완성한 후 자식을 new
			참고) 추상, 인터페이스는 예외적으로 이미 언어차원에서 해당
			인스턴스를 이미 생성하여, 메서드 호출만으로도 인스턴스를
			가져올 수 있도록 제공해줌 */

		//java에서는 윈도우를 직접 사용하는 것이 아니라, 윈도우의 자식인 frame 객체를 사용함
		Frame f=null;  //지역변수는 개발자가 초기화하지 않으면 null로 초기화되지 않음
		f=new Frame();  //윈도우 창 생성함 (초기엔 안보임)
		System.out.println("윈도우 주소값은 "+f);
		
		//프레임 크기 지정, 보이게 설정
		f.setVisible(true);
		f.setSize(300, 400);  //너비, 높이

		
		//컴포넌트들을 붙이기 전에, 배치방법을 결정하자-> 레이아웃
		//FlowLayout flow;
		FlowLayout flow=new FlowLayout();

		//윈도우에 레이아웃 적용
		f.setLayout(flow);

		//버튼 생성
		//Button bt;
		Button bt=new Button("나 버튼");

		//생성된 버튼(요소)을 윈도우에 부착
		f.add(bt);  //컨테이너.부착(); Button is a Component
		
		/*대왕버튼 나오는 이유
			-모든 GUI 프로그램은 컴포넌트 부착에 앞서, 
			배치(Layout)를 결정해야 함
			자바 awt에서는 배치를 관리하는 객체가 따로 지원됨 
			1) FlowLayout (o)  : 자주 사용
			2) BorderLayout (o)
			3) GridLayout (o)
			4) GridBagLayout
			4) CardLayout
		*/
	}
}
