/*자바로 편집기를 디자인해본다*/
package gui;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.TextArea;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.Font;
import java.awt.Color;

class Editor {
	public static void main(String[] args) {
		//메뉴아이템을 메뉴에 부착하고 
		//메뉴를 메뉴바에 부착하여 편집기를 구성해보자
		//메뉴를 생성해야 메뉴바가 보임 
		Frame frame=new Frame("메모장");
		MenuBar bar=new MenuBar();
		TextArea area=new TextArea();
        //Font font = new Font("Verdana", font.BOLD, 20);  폰트크기, 1회성이 아닐경우 참조변수 사용
        area.setFont(new Font("Verdana", Font.BOLD, 20));
        area.setBackground(Color.PINK);  //배경색, static 영역에 올라와서 직접 호출 가능, static은 원본코드에 바로 붙어서 움직임
														 //클래스 변수이기에 new 연산자없이 클래스 직접호출
        //area.setBackground(new Color(255,234,000));  //rgb값 넣을 경우 연산자 사용

		Menu m_file=new Menu("파일");  //'파일' 메뉴

		//파일 메뉴에 딸려있는 아이템들 생성
		//메뉴아이템이 들어갈 방을 만듬 즉, 크기 지정
		MenuItem[] items=new MenuItem[8];  //자바에서는 자료형에 배열을 붙일 수 있음  
		items[0]=new MenuItem("새로만들기");
		items[1]=new MenuItem("새창");
		items[2]=new MenuItem("열기");
		items[3]=new MenuItem("저장");
		items[4]=new MenuItem("다른 이름으로 저장");
		items[5]=new MenuItem("페이지 설정");
		items[6]=new MenuItem("인쇄");
		items[7]=new MenuItem("끝내기");


		//메뉴바는 언제나 윈도우의 최상단에 위치하게 되어있음
		//즉, 그 위치가 고장되어 있음
		//메뉴를 메뉴바에 부착
		bar.add(m_file);

		//요소들을 프레임에 부착
		//메서드에 접근하기 위해 .찍음
		frame.setMenuBar(bar);  //프레임에 메뉴바 부착
		frame.add(area);  //프레임에 area 부착

		//프레임 크기, 보이기
		frame.setVisible(true);
		frame.setSize(800, 500); //다른곳에 영향을 미칠 수 있으므로 아래에 작성함

		//jdk5 버전부터 improved for문이 지원됨, 기존 반복문을 간략화, 속도가 느림
		//파일메뉴에 아이템들 부착하기(반복문)
		for(MenuItem obj:items){  // 변수명 : 집합, 배열의 변수에 집어넣고 컴퓨터가 직접 계산하도록 함
			m_file.add(obj);
		}
		
		/*파일메뉴에 아이템들 부착하기(반복문)
		for(int i=0;i<items.length;i++){
			m_file.add(items[i]);
		}*/

		
		
	}
}
