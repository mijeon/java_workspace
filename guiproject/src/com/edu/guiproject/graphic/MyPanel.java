/*JPnel의 그래픽처리를, 개발자가 주도하여 그리기 위해
paint() 메서드를 재정의하자, 즉 뺏어그리기*/
package com.edu.guiproject.graphic; 
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Image;

class MyPanel extends JPanel{
	//자바gui에서 이미지를 Toolkit 클래스로부터 인스턴스를 얻어올 수 있음
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image img;
	Gallery gallery;  //null
	String[] imgName={"abc.jfif","amgy.jfif","api.jfif","bbnj.jfif","ccv.jfif","eert.jfif","kko.jfif","mop.jfif", "ney.jfif", "rrt.jfif"};
	int index=0;  //몇번째 이미지명을 사용할지를 결정하는 변수

	public MyPanel(Gallery gallery){  //기존의 인스턴스를 생성자로 넘겨받음
		this.gallery=gallery;  //this 쓰는 이유 ? 주소값을 할당받는 this가 MyPanel의 맴버변수임을 알려주기 위해서 사용
		//img=kit.getImage("C:/java_workspace/guiproject/res/sea/"+imgName[index]); //재사용성
		createImage();  //메서드 호출
	}
	//다음이나, 이전 버튼 누를 때마다 이미지를 얻어와야 하므로
	//결국 이미지를 얻는 작업은 재사용성이 높음, 따라서 메서드로 빼놓자
	public void createImage(){
		img=kit.getImage("C:/java_workspace/guiproject/res/sea/"+imgName[index]); 
	}
	/*
	paint() 메서드는 개발자가 호출하는 메서드가 아니라, 재정의해야함 (오버라이딩)
	시스템에 의해 그려진 컴포넌트가 화면에 그려져야할 때 내부적으로 알아서 흐름
	update() : 기존 화면 지우기
	paint() : 그림을 그림
	*/
	public void paint(Graphics g){  //new MyPanel(인스턴스); //abstract : 추상클래스
		System.out.println("저 그리고 있어요");
		//drawImage(Image img, int x, int y, int width, int height, ImageObserver observer : 이미지를 끌어안은거)
		//이미지의 관찰자를 가장 바깥쪽 컨테이너로 지정
		g.drawImage(img, 0, 0, 490, 490, gallery);  //Gallery인스턴스
																		//객체타입 값 -> 정의, 값 -> 사용
	}
}
