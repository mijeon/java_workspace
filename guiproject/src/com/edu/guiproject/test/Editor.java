package test;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.TextArea;
import java.awt.MenuItem;
import java.awt.Font;
import java.awt.Color;

class Editor {
	public static void main(String[] args) {
		//메뉴아이템을 메뉴에 부착하고
		//메뉴를 메뉴바에 부착하여 편집기를 구성해보자
		Frame frame=new Frame("메모장");
		MenuBar bar=new MenuBar();
		Menu m_file=new Menu("파일");
		TextArea area=new TextArea();
		area.setFont(new Font("Verdana", Font.BOLD, 20));
		area.setBackground(Color.PINK);

		//파일메뉴의 아이템들 생성
		//메뉴아이템이 들어갈 방을 만듬 즉, 크기지정
		MenuItem[] items=new MenuItem[8];
		items[0]=new MenuItem("새로 만들기");
		items[1]=new MenuItem("새창");
		items[2]=new MenuItem("열기");
		items[3]=new MenuItem("저장");
		items[5]=new MenuItem("다른 이름으로 저장");
		items[6]=new MenuItem("페이지 설정");
		items[7]=new MenuItem("인쇄");
		items[4]=new MenuItem("끝내기");

		//파일 메뉴에 아이템들 부착하기
		for(MenuItem obj:items){  
			m_file.add(obj);
		}

		//메뉴를 메뉴바에 부착
		bar.add(m_file);

		//요소들을 프레임에 부착
		frame.setMenuBar(bar);
		frame.add(area);

		//프레임 크기, 보이게 설정
		frame.setVisible(true);
		frame.setSize(800, 500);


	}
}
