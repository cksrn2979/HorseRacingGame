package controller;

import java.util.Iterator;

import model.Horse;
import service.HorseRunners;
import view.WinnerWindow;

public class GameLogic {
	private static final GameLogic instance=new GameLogic();
	private HorseRunners horses;
	private Boolean play=false;
	
	public static GameLogic getInsatnce(){
		return instance;
	}
	
	public Boolean getPlay() {
		return play;
	}

	public void setPlay(Boolean play) {
		this.play = play;
	}

	public void gamestart(){
		horses=HorseRunners.getInstance();
		
		if(play==true)return;
		play=true;
		Iterator<Horse> iter=horses.iteraoter();
		
		while(iter.hasNext()){
			Horse horse= iter.next();
			horse.run();			
		}
		
	}
	
	public void gameover(Horse winner){		
		play=false;
		new WinnerWindow(winner);
	}
}

