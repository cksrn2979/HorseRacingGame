package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	private JPanel northPanel;
	private JPanel southPanel;
	private JPanel centerPanel;
	private final int WIDTH=1000;
	private final int HEIGHT=600;
	
	public MainFrame(){
	
		this.setVisible(true);	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.getContentPane().setBackground(Color.WHITE);	
		
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();		
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);

		northPanel=new NorthPanel();
		southPanel=new SouthPanel();
		centerPanel=new CenterPanel();
		
		this.add(northPanel,BorderLayout.NORTH);
		this.add(centerPanel,BorderLayout.CENTER);
		this.add(southPanel,BorderLayout.SOUTH);
	}	
}
