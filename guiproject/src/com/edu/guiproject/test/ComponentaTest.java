package test;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.TextArea;
import java.awt.CheckboxGroup;

//import java.awt.BorderLayout;

class ComponentaTest {
	public static void main(String[] args) {
		//프레임 생성
		Frame frame=new Frame("나의 프레임");
		FlowLayout flow=new FlowLayout();  //배치관리자

		//버튼 생성
		Button bt=new Button("버튼1");		

		//텍스트필드 생성
		TextField t1=new TextField(15);

		//체크박스 생성
		Checkbox ch1=new Checkbox("여행", true);
		Checkbox ch2=new Checkbox("독서", false);

		//셀렉트박스 생성
		Choice sal=new Choice();
		sal.add("red");
		sal.add("green");
		sal.add("blue");

		//텍스트 영역 생성
		TextArea area=new TextArea("텍스트 영역", 10, 10);

		//체크박스 그룹 생성
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox g1=new Checkbox("여", cg, true);
		Checkbox g2=new Checkbox("남",cg, false);

		//배치관리자를 프레임에 적용
		frame.setLayout(flow);

		/*BorderLayout은 영역을 지정해주지 않으면 마지막으로 추가된 객체가 화면에 꽉참
		frame.add(bt, BorderLayout.NORTH);
		frame.add(t1, BorderLayout.CENTER);*/

		//프레임에 부착
		frame.add(bt);
		frame.add(t1);
		frame.add(ch1);
		frame.add(ch2);
		frame.add(sal);
		frame.add(area);
		frame.add(g1);
		frame.add(g2);

		//프레임 크기 지정, 보이게 설정
		frame.setSize(500, 600);
		frame.setVisible(true);
	}
}
