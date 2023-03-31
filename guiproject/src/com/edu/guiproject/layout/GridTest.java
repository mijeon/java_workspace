/*
FlowLayout : 바깥쪽 컨테이너의 크기에 따라, 내용물이 흘러다니는 레이아웃
BorderLayout : 동, 서, 남, 북, 센터 총 5가지 방위를 갖는 레이아웃
GridLayout : 행과 열로 이루어진 레이아웃(격자)
CardLayout : 화면전환 시 사용되는 레이아웃
GridbagLayout : GridLayout을 보다 상세히 제어하는 레이아웃
*/
package com.edu.guiproject.layout;
//그리드 레이아웃 사용해보기
import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;

class GridTest extends Frame {
	Button[] btn=new Button[15];  //자바에서는 배열크기 명시
	GridLayout grid;
	
	
	//생성자메서드 정의, 초기화
	public GridTest(){
		//int x=1; 부모의 초기화보다 앞서는 자식의 코드는 있을 수 없음

		//내가 초기화되기 전에, 부모가 먼저 초기화되어야 함
		//부모의 인수있는 생성자를 호출하기를 원하면, super로 호출
		super("그리드 테스트");  //프레임을 new 연산자로 생성할 경우 창이 하나 더 생기기 때문에 부모 프레임을 사용해줌
		
		//버튼이 생성되기 전에 그리드가 적용되어야하므로 위치를 버튼위로 변경-> 
		grid=new GridLayout(5, 3);  //2층 4호수
		setLayout(grid);  //프레임에 그리드레이아웃 적용
		//이 시점부터 레이아웃은 BorderLayout --> GridLayout

		for (int i=0;i<btn.length;i++){
			//그동안 우리가 사용해왔던 문자열을 정수로 변환하는것은 익숙하지만 "1" --> parseInt() : 문자를 숫자로
			//역으로 정수형을 문자열객체로 변환하는것은 자바의 특정 객체들이 지원함, 이 객체들을 가르켜 Wrapper클래스라 함
			btn[i]=new Button(Integer.toString(i));  //버튼 안에 문자를 넣어주기 위해 숫자 ->문자로 변환함
			add(btn[i]);  //프레임에 부착
		}

		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		//선언된 생성자메서드를 호출 및 실행
		new GridTest(); 
	}
}
