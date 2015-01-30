package firstapplet;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Applet extends JApplet {
	
	public void start(){
		
		
		
	}
	
	public void init(){
		setBackground(Color.pink);
	}
	
	public void paint(Graphics g){
		g.drawString("Hi Vlad", 10, 10);
		
	}

}
