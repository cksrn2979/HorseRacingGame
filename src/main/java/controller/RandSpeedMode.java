package controller;

import java.util.LinkedList;

import model.CrazySpeedMode;
import model.DyingSpeedMode;
import model.HighSpeedMode;
import model.Horse;
import model.DefaultSpeedMode;
import model.SpeedMode;
import service.HorseRunners;

public class RandSpeedMode implements Runnable{
	private LinkedList<SpeedMode> modes;
	private HorseRunners horses;
	
	RandSpeedMode(){
		modes=new LinkedList<SpeedMode>();
		modes.add(new CrazySpeedMode());
		modes.add(new HighSpeedMode());
		modes.add(new DefaultSpeedMode());
		modes.add(new DyingSpeedMode());
		
		horses= HorseRunners.getInstance();		
	}

	public void run() {
		while(true){
			int randomMode = (int) (Math.random() * 4);
			SpeedMode mode= modes.get(randomMode);
			
			int randomHorse = (int) (Math.random() * 4);
			Horse horse=horses.getHorse(randomHorse);
			
			horse.setRunningMode(mode);
			
			try{
				Thread.sleep(300);
			}catch (Exception e) {
				return ;
			}
			
		}
	}

}
