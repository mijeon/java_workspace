package test.layout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;

class GridTest extends Frame {
	//맴버변수 정의
	Button[] bt=new Button[15];  //배열크기 명시
	GridLayout grid;
	
	public GridTest(){
		super("그리드 테스트");

		grid=new GridLayout(5, 3); //행, 열


		//프레임에 그리드레이아웃 적용
		setLayout(grid);

		for (int i=0; i<bt.length; i++){
			bt[i]=new Button(Integer.toString(i)); 
			add(bt[i]);  //프레임에 부착
		}

		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		//선언된 생성자메서드를 호출 및 선언
		new GridTest();
	}
}
