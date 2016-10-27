package controller;

import java.util.Iterator;

import model.Horse;
import service.HorseRunners;
import view.WinnerWindow;

public class GameLogic {
	private static final GameLogic instance=new GameLogic();
	private HorseGraphicMover horseGraphicMover;
	private HorseRunners horses;
	private Thread randSpeedmode;
	private Boolean play;
	
	public static GameLogic getInsatnce(){
		return instance;
	}

	public void init(){
		play=false;
		
		horses=HorseRunners.getInstance();		
		horses.clear();		
				
		horses.add(new Horse());
		horses.add(new Horse());
		horses.add(new Horse());
		horses.add(new Horse());
	}
	
	public void gamestart(){
		if(play==true)return;
		play=true;
		Iterator<Horse> iter=horses.iteraoter();
		
		while(iter.hasNext()){
			Horse horse= iter.next();
			horse.run();			
		}
		
		randSpeedmode= new Thread(new RandSpeedMode());
		randSpeedmode.start();
		
		horseGraphicMover=new HorseGraphicMover();
		horseGraphicMover.startMove();		
	}
	
	public void gameover(){
		Horse winner = null;
		int maxMeter = 0;
		
		randSpeedmode.interrupt();
		Iterator<Horse> iter=horses.iteraoter();		
		while(iter.hasNext()){
			Horse horse= iter.next();
			if(horse.getMeter()>maxMeter){
				maxMeter=horse.getMeter();
				winner=horse;
			}
			horse.stop();			
		}
		if(winner==null)
			System.out.println("aa");
		new WinnerWindow(winner);
	}
}

