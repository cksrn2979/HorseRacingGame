package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

import model.Horse;

public class WinnerWindow extends JWindow{
	public final int WIDTH=500;
	public final int HEIGHT=250;
	
	private Horse winner;

	
	public WinnerWindow(Horse winner){
		this.setAlwaysOnTop(true);
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
		private JButton btn_exit;
		private JLabel winnerGraphic;
		
		WinerPanel(){
			this.setLayout(null);
			this.setBackground(new Color(255, 0,0,0));
			winnerGraphic= new JLabel();
			winnerGraphic.setIcon(winner.getGraphic().getIcon());
			winnerGraphic.setSize(80,80);			
			winnerGraphic.setLocation(210,80);
			add(winnerGraphic);	
			
			btn_exit =new JButton();
			btn_exit.setSize(70,35);
			btn_exit.setLocation(210,180);
			btn_exit.setOpaque(false);
			btn_exit.setBorderPainted(false);
			btn_exit.setFocusPainted(false);
			btn_exit.setContentAreaFilled(false);
			btn_exit.setSize(70,35);
			btn_exit.setIcon(new ImageIcon("images/btn_exit.jpg"));
			btn_exit.setRolloverIcon(new ImageIcon("images/btn_exit_rollover.jpg"));
	
			
			this.add(btn_exit);
			
			btn_exit.addActionListener(new ActionListener() {				
				public void actionPerformed(ActionEvent e) {
					System.exit(1);
				}
			});
			
	
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			ImageIcon icon=new ImageIcon("images/WinerWindow.jpg");
			Image img=icon.getImage();		
			g.drawImage(img, 0,0,this);

		}
	}
	

}
