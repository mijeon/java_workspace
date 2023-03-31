/*Canvas의 그림을 개발자가 주도하여, 뺐어 그려야 하므로 paint() 메서드를 재정의하기 위해 이 클래스를 정의한 것임*/
package com.edu.guiproject.graphic;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

class XCanvas extends Canvas {
	//paint 메서드에 어떤 내용을 넣느냐에 따라 그림이 결정됨
	public void paint(Graphics g){
		g.setColor(Color.red);  //붓을 빨간색 페인트로
		g.drawOval(0, 0, 200, 200);
	}
}
