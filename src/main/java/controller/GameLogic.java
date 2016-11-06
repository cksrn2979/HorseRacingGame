package controller;

import java.util.Iterator;

import model.Horse;
import service.HorseRunners;
import view.WinnerWindow;

public class GameLogic {
	private static final GameLogic instance=new GameLogic();
	private HorseRunners horses;
	private Thread horseGraphicMover;
	private Boolean play=false;
	
	public static GameLogic getInsatnce(){
		return instance;
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
		
		horseGraphicMover=new Thread(new HorseMoverThread());
		horseGraphicMover.start();		
	}
	
	public void gameover(Horse winner){
		
		Iterator<Horse> iter=horses.iteraoter();		
		while(iter.hasNext()){
			Horse horse=iter.next();
			horse.stop();			
		}
		
		horseGraphicMover.interrupt();
		
		new WinnerWindow(winner);
	}
}

