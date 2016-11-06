package controller;

import javax.swing.ImageIcon;

import model.Horse;
import service.HorseRunners;
import view.MainFrame;

public class MainApp {
	public static void main(String[] args){
		HorseRunners horses=HorseRunners.getInstance();
		
		Horse horse1= new Horse();
		horse1.setIcon(new ImageIcon("images/horse1.gif"));
		horses.add(horse1);
		
		Horse horse2= new Horse();
		horse2.setIcon(new ImageIcon("images/horse2.gif"));
		horses.add(horse2);
		
		Horse horse3= new Horse();
		horse3.setIcon(new ImageIcon("images/horse3.gif"));
		horses.add(horse3);
		
		Horse horse4= new Horse();
		horse4.setIcon(new ImageIcon("images/horse4.gif"));
		horses.add(horse4);

		
		new MainFrame();
	}
}
