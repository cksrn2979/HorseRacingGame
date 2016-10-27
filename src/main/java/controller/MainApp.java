package controller;

import view.MainFrame;

public class MainApp {
	public static void main(String[] args){
		GameLogic logic=GameLogic.getInsatnce();
		logic.init();
		new MainFrame();
	}
}
