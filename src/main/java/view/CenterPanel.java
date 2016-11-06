package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import model.Horse;

public class CenterPanel extends JPanel{
	public final int WIDTH=1000;
	public final int HEIGHT=400;
	private RacingPanel racingPanel;
	
	public CenterPanel(){
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setBackground(null);
		this.setLayout(null);
		
		racingPanel=new RacingPanel();
		racingPanel.setSize(racingPanel.WIDTH,racingPanel.HEIGHT);
		racingPanel.setLocation(50, 45);
		this.add(racingPanel);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		ImageIcon icon=new ImageIcon("images/centerpanel.jpg");
		Image img=icon.getImage();		
		g.drawImage(img, 0,0,this);
	}
	

}
