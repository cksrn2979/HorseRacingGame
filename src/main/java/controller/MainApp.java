package controller;

import model.Horse;
import service.HorseRunners;
import view.MainFrame;

public class MainApp {
	public static void main(String[] args){
		HorseRunners horses=HorseRunners.getInstance();			
		horses.add(new Horse());
		horses.add(new Horse());
		horses.add(new Horse());
		horses.add(new Horse());
		
		new MainFrame();
	}
}
