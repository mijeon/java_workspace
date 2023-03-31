package gui; 
import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.TextArea;
import java.awt.CheckboxGroup;

//더 많은 컴포넌트들을 등장시켜보자
class ComponentaTest {
	public static void main(String[] args) {
		//버튼 생성
		Button bt=new Button("버튼1");

		//텍스트필드 생성
		TextField t1=new TextField(15);

		//체크박스 생성
		Checkbox ch1=new Checkbox("여행", true);
		Checkbox ch2=new Checkbox("독서", false);

		//셀렉트 박스 생성
		Choice sel=new Choice();
		sel.add("Red");
		sel.add("Green");
		sel.add("Blue");

		//텍스트 영역 생성
		TextArea area=new TextArea("텍스트 영역", 10, 15, 30);

		//체크박스 그룹 생성
		//자바에서는 HTML에 Radio와 같은 컴포넌트가 별도로 없고 Checkbox를 그룹화시키면 됨
		CheckboxGroup cg=new CheckboxGroup();  //그룹화만 시키는 객체, 요소(Component)가 되진 않음 
		Checkbox g1=new Checkbox("여자", cg, true);  //그룹명을 명시하지 않으면 개개의 체크박스로만 생성됨
		Checkbox g2=new Checkbox("남자", cg, false);


		//프레임 생성
		Frame frame=new Frame("나의 프레임");
		FlowLayout flow=new FlowLayout();  //배치관리자(LayoutManager 중 하나)
		
		//배치관리자를 프레임에 적용
		frame.setLayout(flow);

		//프레임에 버튼 부착
		frame.add(bt);
		frame.add(t1);
		frame.add(ch1);
		frame.add(ch2);
		frame.add(sel);
		frame.add(area);
		frame.add(g1); 
		frame.add(g2); 

		frame.setSize(500, 600);  //프레임 크기
		frame.setVisible(true); //보이게
	}
}
