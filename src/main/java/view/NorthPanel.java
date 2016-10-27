package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NorthPanel extends JPanel{
	private final int WIDTH=1000;
	private final int HEIGHT=100;
		
	public NorthPanel(){
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		ImageIcon icon=new ImageIcon("images/northpanel.jpg");
		Image img=icon.getImage();
		
		g.drawImage(img, 0, 0, this);
	}
}
