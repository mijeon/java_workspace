/*Canvas�� �׸��� �����ڰ� �ֵ��Ͽ�, ���� �׷��� �ϹǷ� paint() �޼��带 �������ϱ� ���� �� Ŭ������ ������ ����*/
package com.edu.guiproject.graphic;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

class XCanvas extends Canvas {
	//paint �޼��忡 � ������ �ִ��Ŀ� ���� �׸��� ������
	public void paint(Graphics g){
		g.setColor(Color.red);  //���� ������ ����Ʈ��
		g.drawOval(0, 0, 200, 200);
	}
}
