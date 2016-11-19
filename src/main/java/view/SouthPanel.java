package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.GameLogic;


public class SouthPanel extends JPanel{
	public final int WIDTH=1000;
	public final int HEIGHT=60;
	
	private JButton btn_start;
	
	public SouthPanel(){
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setLayout(new FlowLayout());
		this.setBackground(null);
		
		btn_start=new JButton();
		btn_start.setOpaque(false);
		btn_start.setBorderPainted(false);
		btn_start.setFocusPainted(false);
		btn_start.setContentAreaFilled(false);
		btn_start.setSize(70,35);
		btn_start.setIcon(new ImageIcon("images/btn_start.jpg"));
		btn_start.setRolloverIcon(new ImageIcon("images/btn_start_rollover.jpg"));

		this.add(btn_start);
		
		btn_start.addActionListener(new ActionListener() {
			GameLogic logic=GameLogic.getInsatnce();			
			public void actionPerformed(ActionEvent e) {
				logic.gamestart();
			}
		});
		
	}

}
