/*디자인 및 외형을 나의 맞춤형으로 바꾸기 위한 나만의 버튼 
   (커스텀 버튼) : 재사용성 예상*/
package com.edu.guiproject.graphic;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;

class MyButton extends JButton{
	public MyButton(Color color){
		setPreferredSize(new Dimension(50, 50));  //너비, 높이
		setBackground(color);
		//setBackground(new Color());  //rgb컬러 넣을 경우 new 생성자 사용
	}
}
