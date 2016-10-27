package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

import model.Horse;

public class WinnerWindow extends JWindow{
	private final int WIDTH=500;
	private final int HEIGHT=250;
	private Horse winner;
	
	public WinnerWindow(Horse winner){
		this.setSize(WIDTH,HEIGHT);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.winner=winner;
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();		
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);
		
		this.setContentPane(new WinerPanel());
		revalidate();
	}
	
	class WinerPanel extends JPanel{
		WinerPanel(){
			this.setLayout(null);
			this.setBackground(new Color(255, 0,0,0));
			JLabel winnerGraphic= new JLabel();
			winnerGraphic.setIcon(winner.getGraphic().getIcon());
			winnerGraphic.setSize(80,80);			
			winnerGraphic.setLocation(210,100);
			add(winnerGraphic);		
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			ImageIcon icon=new ImageIcon("images/WinerWindow.jpg");
			Image img=icon.getImage();		
			g.drawImage(img, 0,0,this);

		}
	}
	

}
