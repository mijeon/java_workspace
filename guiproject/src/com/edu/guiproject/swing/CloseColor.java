package com.edu.guiproject.swing;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class CloseColor extends JFrame{
		OpenColor oc;
		Panel p;

		public CloseColor(OpenColor oc){
			p=new Panel();
			this.oc=oc;

			add(p);

			setVisible(true);
			setSize(200, 300);
		}
}
