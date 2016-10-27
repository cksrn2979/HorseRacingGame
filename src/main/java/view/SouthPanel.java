package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.GameLogic;

class GraphicButton extends JButton{
	public GraphicButton() {		
		this.setOpaque(false);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setContentAreaFilled(false);
	}
}

public class SouthPanel extends JPanel{
	private final int WIDTH=1000;
	private final int HEIGHT=60;
	
	private JButton btn_start;
	private JButton btn_reset;
	
	public SouthPanel(){
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setLayout(new FlowLayout());
		this.setBackground(null);
		
		btn_start=new GraphicButton();
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
